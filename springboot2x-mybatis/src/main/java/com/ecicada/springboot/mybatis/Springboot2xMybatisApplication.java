package com.ecicada.springboot.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = { "com.ecicada.springboot.mybatis.mapper" })
public class Springboot2xMybatisApplication {
    // 在mybatis接口上加上@Mapper注入mybatis容器，就不需要在启动类上加@MapperScan
    public static void main(String[] args) {
        SpringApplication.run(Springboot2xMybatisApplication.class, args);
    }

}
