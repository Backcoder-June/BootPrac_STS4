package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = "upload")
@MapperScan(basePackages = "Board")
@ComponentScan(basePackages = "Board")
@ComponentScan(basePackages = "upload")
@ComponentScan
@SpringBootApplication
public class Myboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Myboot1Application.class, args);
	}

}
