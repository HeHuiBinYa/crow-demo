package com.crow.service;

import com.crow.mapper.OrderMapper;
import com.crow.mapper.UserMapper;
import com.crow.model.Order;
import com.crow.model.User;
import io.shardingsphere.transaction.annotation.ShardingTransactionType;
import io.shardingsphere.transaction.api.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * @PackageName:IntelliJ IDEA
 * @ClassName:UserOrderService
 * @Description:
 * @Author 青黑色的乌鸦
 * @Email xingtan1976tkt@163.com
 * @Date 2023/8/30 11:42
 * @Role
 */
@Service
public class UserOrderService implements Serializable {
    private UserMapper userMapper;
    private OrderMapper orderMapper;

    @Autowired
    public UserOrderService(UserMapper userMapper, OrderMapper orderMapper) {
        this.userMapper = userMapper;
        this.orderMapper = orderMapper;
    }

    @ShardingTransactionType(TransactionType.XA)
    @Transactional(rollbackFor = Exception.class)
    public int saveUserOrder(User user, Order order) {
        userMapper.insertUser(user);
        order.setUser_id(user.getUid());
        orderMapper.addOrder(order);
        //int a = 1/0; //测试回滚，统一提交的话，将这行注释掉就行
        return 1;
    }
}
