package com.practice.spring.aop.bean;

import org.springframework.stereotype.Component;

@Component
public class Circle {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}