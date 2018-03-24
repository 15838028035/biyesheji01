package com.lj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lj.mapper")
public class BiYeSheJiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiYeSheJiServerApplication.class, args);
	}
}
