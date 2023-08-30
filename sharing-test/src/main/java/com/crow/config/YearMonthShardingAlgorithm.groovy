package com.crow.config

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue


class YearMonthShardingAlgorithm implements PreciseShardingAlgorithm<String>{
    private static final String SPLITTER = "_";

    @Override
    String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        String tbName = preciseShardingValue.getLogicTableName() + preciseShardingValue.getValue();
        System.out.println("Sharding input:" + preciseShardingValue.getValue() + ", output:{}" + tbName);
        return tbName;
    }
}
