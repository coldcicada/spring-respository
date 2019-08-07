package com.cicada.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisAnnotationApplication.class, args);
    }

}
