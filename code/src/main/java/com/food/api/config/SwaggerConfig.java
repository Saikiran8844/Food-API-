package com.food.api.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.BasicAuth;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.OperationsSorter;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

	/**
	 * Instance of {@link BuildProperties}.
	 */
	@Autowired
	private BuildProperties buildProperties;
	// -----------------------------------------------------------------------------------------------------------------
	/**
	 * Bean for configure Swagger. 
	 * 
	 * @return
	 */
	@Bean
	public Docket apiDocumentation() {
		return new Docket(DocumentationType.SWAGGER_2)  
	            .apiInfo(metaData())    
	            .select()    
	            .apis(RequestHandlerSelectors.basePackage("com.food"))    
	            .build();
	}
	
	// -----------------------------------------------------------------------------------------------------------------
	/**
	 * Local method to add meta-data on Swagger UI page.
	 * 
	 * @return
	 */
	private ApiInfo metaData(){
        return new ApiInfoBuilder()
                .title("Url shortener API")
                .description("API reference for developers")
                .version("1.0")
                .build();
    }
	// -----------------------------------------------------------------------------------------------------------------
}