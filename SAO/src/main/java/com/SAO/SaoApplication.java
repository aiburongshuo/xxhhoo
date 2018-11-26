package com.SAO;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages={"com.dao"})
@ComponentScan(basePackages= {"com.controller","com.services"})
public class SaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaoApplication.class, args);
	}
}
