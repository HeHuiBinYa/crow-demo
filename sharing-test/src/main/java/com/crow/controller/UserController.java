package com.crow.controller;

import com.crow.mapper.UserMapper;
import com.crow.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @PackageName:IntelliJ IDEA
 * @ClassName:UserController
 * @Description:
 * @Author 青黑色的乌鸦
 * @Email xingtan1976tkt@163.com
 * @Date 2023/8/27 13:05
 * @Role
 */
@RestController
public class UserController {
    private UserMapper userMapper;

    @Autowired
    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @PostMapping("/list")
    public List<User> list(){
        return userMapper.queryUserList();
    }

    @PostMapping("/insert")
    public Boolean insert(User user){
        return userMapper.insertUser(user);
    }
}
