package com.cy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
@SpringBootApplication
@EnableCaching //启用spring中cache配置
@EnableAsync //启用spring 中的异步配置
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
