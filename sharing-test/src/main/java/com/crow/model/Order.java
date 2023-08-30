package com.crow.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @PackageName:IntelliJ IDEA
 * @ClassName:Order
 * @Description:
 * @Author 青黑色的乌鸦
 * @Email xingtan1976tkt@163.com
 * @Date 2023/8/30 8:29
 * @Role
 */
@Data
public class Order implements Serializable {
    private Long oid;
    private String onumber;
    private Long user_id;
    private Date birthday;
    private String yearmonth;
    private Date createTime;
}
