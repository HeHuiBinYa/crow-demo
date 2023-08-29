package com.crow.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @PackageName:IntelliJ IDEA
 * @ClassName:User
 * @Description:
 * @Author 青黑色的乌鸦
 * @Email xingtan1976tkt@163.com
 * @Date 2023/8/27 13:00
 * @Role
 */
@Data
public class User implements Serializable {
    private Integer uid;
    private String uname;
    private String sex;
    private Integer age;
    private Date birthday;
}
