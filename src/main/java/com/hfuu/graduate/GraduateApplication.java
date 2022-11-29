package com.hfuu.graduate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@MapperScan("com.hfuu.graduate.mapper")
public class GraduateApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraduateApplication.class, args);
	}

}
