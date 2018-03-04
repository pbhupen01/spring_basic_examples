package com.practice.spring.configuration.bean;

public class HelloWorldImpl implements HelloWorld {

    public void printHelloWorld(String msg) {

        System.out.println("Hello : " + msg);
    }

}