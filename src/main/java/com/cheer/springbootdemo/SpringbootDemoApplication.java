package com.cheer.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// = @ComponentScan + @SpringBootConfiguration + @EnableAutoConfiguration + @EnableWebMvc
@SpringBootApplication
@MapperScan("com.cheer.springbootdemo.dao")
public class SpringbootDemoApplication {
    //springboot入口
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}
