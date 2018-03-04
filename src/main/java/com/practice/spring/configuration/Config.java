package com.practice.spring.configuration;

import com.practice.spring.configuration.bean.HelloWorld;
import com.practice.spring.configuration.bean.HelloWorldImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name="helloBean")
    public HelloWorld helloWorld(){
        return new HelloWorldImpl();
    }
}
