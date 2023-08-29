package com.crow.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.time.LocalDateTime;
import java.util.*;

/**
 * @PackageName:IntelliJ IDEA
 * @ClassName:BirthdayAlgorithm
 * @Description:
 * @Author 青黑色的乌鸦
 * @Email xingtan1976tkt@163.com
 * @Date 2023/8/28 22:58
 * @Role
 */
public class BirthdayAlgorithm implements PreciseShardingAlgorithm<Date> {
    List<Date> dateTimes = new ArrayList<>();

    {
        Calendar instance1 = Calendar.getInstance();
        instance1.set(2021,1,1,0,0,0);
        Calendar instance2 = Calendar.getInstance();
        instance2.set(2022,1,1,0,0,0);
        Calendar instance3 = Calendar.getInstance();
        instance3.set(2023,1,1,0,0,0);
        dateTimes.add(instance1.getTime());
        dateTimes.add(instance2.getTime());
        dateTimes.add(instance3.getTime());
    }

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Date> preciseShardingValue) {
        Date value = preciseShardingValue.getValue();

        Iterator<String> iterator = collection.iterator();
        String target = "";

        for (Date date : dateTimes) {
            target = iterator.next();
            if (value.before(date)){
                break;
            }
        }
        return target;
    }
}
