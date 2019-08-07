package com.ecicada.springboot.transactional;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = { "com.ecicada.springboot.transactional.mapper" })
public class Springboot2xTransactionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2xTransactionalApplication.class, args);
	}

}
