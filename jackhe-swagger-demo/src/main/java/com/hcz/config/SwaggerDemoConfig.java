package com.hcz.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @EnableSwagger2 是否开启swagger的方法
 * @author hechangzhi 2018年1月12日
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerDemoConfig {
	@Bean
	public Docket testOneApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("testOne测试1分组")						//给api分组
				.select()  //控制哪些路径给swagger2来展示
				.apis(RequestHandlerSelectors.withClassAnnotation(Api.class))			//扫描的位置全部注解都扫描
//				.apis(RequestHandlerSelectors.basePackage("com.hcz.swagger.testone"))	//指定的包扫描	
                .paths(PathSelectors.any())
                .build()
                .directModelSubstitute(LocalDate.class, String.class)
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo());
	}
//	@Bean
//	public Docket testTwoApi(){
//		return new Docket(DocumentationType.SWAGGER_2)
//				.groupName("testTwo测试1分组")						//给api分组
//				.select()  //控制哪些路径给swagger2来展示
//				//.apis(RequestHandlerSelectors.withClassAnnotation(Api.class))			//扫描的位置全部注解都扫描
//				.apis(RequestHandlerSelectors.basePackage("com.hcz.swagger.testtwo"))	//指定的包扫描	
//                .paths(PathSelectors.any())
//                .build()
//                .directModelSubstitute(LocalDate.class, String.class)
//                .useDefaultResponseMessages(false)
//                .apiInfo(apiInfo());
//	}
	private ApiInfo apiInfo(){
		return new ApiInfoBuilder()
                .title("测试接口1.0.0")  //设置文档的标题
                .description("swagger测试文档") //设置文档的描述
                .termsOfServiceUrl("http://www.baidu.com//")//设置文档的License信息->1.3 License information
                .version("1.0")//设置文档的版本信息
                .build();
	}
}
