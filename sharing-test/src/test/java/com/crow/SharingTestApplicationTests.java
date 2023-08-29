package com.crow;

import com.crow.mapper.UserMapper;
import com.crow.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;

@SpringBootTest
class SharingTestApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        Calendar instance1 = Calendar.getInstance();
        instance1.set(2020,1,1,0,0,0);

        User user = new User();
        user.setUname("小五");
        user.setAge(23);
        user.setSex("男");
        user.setBirthday(instance1.getTime());

        System.out.println(userMapper.insertUser(user));
    }

    @Test
    void list(){
        userMapper.queryUserList().forEach(System.out::println);
    }

    @Test
    void byUname(){
        System.out.println(userMapper.queryUserByUname("小红"));
    }
}
