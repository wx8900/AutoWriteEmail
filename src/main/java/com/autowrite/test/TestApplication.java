package com.autowrite.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Jack
 *
 * 1. 现在Spring Boot 要强制配置application-test.yml文件
 * 2. 添加启动TestApplication类参数spring.profiles.active=test
 */
@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
