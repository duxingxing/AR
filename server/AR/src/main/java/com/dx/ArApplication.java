package com.dx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.dx.data.mybatis.mapper.*")
public class ArApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArApplication.class, args);
	}
}
