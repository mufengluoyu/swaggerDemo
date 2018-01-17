package com.hcz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 保持与config目录在一个级别，不然swagger的bean加载失败。
 * @author hechangzhi 2018年1月16日
 *
 */
@SpringBootApplication
public class SwaggerDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SwaggerDemoApplication.class, args);
	}

}
