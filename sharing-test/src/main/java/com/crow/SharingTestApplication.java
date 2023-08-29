package com.crow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.crow.mapper")
@SpringBootApplication
public class SharingTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharingTestApplication.class, args);
    }

}
