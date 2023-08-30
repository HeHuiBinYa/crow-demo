package com.crow.mapper;

import com.crow.model.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Date;

@SpringBootTest
public class OrderMapperTest {
    @Autowired
    private OrderMapper orderMapper;

    @Test
    void orderMapperTest(){
        Order order = new Order();
        order.setUser_id(1L);
        order.setOnumber("ORDER2002102215022012");
        order.setYearmonth("202103");

        order.setBirthday(new Date(2021-1900,2,3));
        order.setCreateTime(new Date(2021-1900,2,3));

        orderMapper.addOrder(order);
        System.out.println(order.getOid());
    }
}