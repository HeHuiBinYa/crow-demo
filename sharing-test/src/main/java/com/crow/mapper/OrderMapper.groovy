package com.crow.mapper

import com.crow.model.Order
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Options

@Mapper
interface  OrderMapper {
    @Insert("insert into order(onumber,user_id,yearmonth,createTime,birthday) values(#{onumber},#{user_id},#{yearmonth},#{createTime},#{birthday})")
    @Options(useGeneratedKeys = true,keyColumn = "oid",keyProperty = "oid")
    void addOrder(Order order);
}
