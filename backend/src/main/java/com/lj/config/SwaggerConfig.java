package com.lj.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	/**
     * 扫描的包路径，配置在application中
     */
    @Value(value = "${swagger.package}")
    private String swaggerPackage;
	
	 @Bean
	    public Docket buildDocket() {
		 return new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(buildApiInfo()).select()
	                // 设置包扫描路径
	                .apis(RequestHandlerSelectors.basePackage(swaggerPackage))
	                .paths(PathSelectors.any()).build();

	}
	
	private ApiInfo buildApiInfo() {
		return new ApiInfoBuilder()
                // API的Title
                .title("SpringBoot-Demo之Swagger2项目 Restful APIs")
                // 描述信息
                .description("Swagger2的api接口文档")
                .termsOfServiceUrl("http://localhost:8080/doc.html")
                // 版本号
                .version("1.0")
                .build();
	}
}
