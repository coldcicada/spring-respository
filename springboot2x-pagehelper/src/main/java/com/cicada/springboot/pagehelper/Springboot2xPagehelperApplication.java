package com.cicada.springboot.pagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cicada.springboot.pagehelper.mapper")
public class Springboot2xPagehelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2xPagehelperApplication.class, args);
    }

}
