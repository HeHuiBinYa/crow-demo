package com.crow.mapper;

import com.crow.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @PackageName:IntelliJ IDEA
* @ClassName:UserMapper
* @Description:
* @Author 青黑色的乌鸦 
* @Email xingtan1976tkt@163.com
* @Date 2023/8/27 13:01
* @Role 
*/
@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> queryUserList();

    @Insert("insert into user(uname,sex,age,birthday) values (#{uname},#{sex},#{age},#{birthday})")
    public Boolean insertUser(User user);

    @Select("select * from user where uname=#{name}")
    User queryUserByUname(String name);
}
