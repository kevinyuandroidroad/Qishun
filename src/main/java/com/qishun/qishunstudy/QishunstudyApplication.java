package com.qishun.qishunstudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.qishun.qishunstudy.dao")
public class QishunstudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(QishunstudyApplication.class, args);
	}
}
