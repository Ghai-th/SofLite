package com.soflite.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author Ghai-th
 * @date 2023-07-30 下午 4:50
 */
@EnableOpenApi
@EnableWebMvc
@SpringBootApplication
@ComponentScan(basePackages = {"com.soflite"})
@MapperScan(basePackages = {"com.soflite.service.mapper"})
public class Application {
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
