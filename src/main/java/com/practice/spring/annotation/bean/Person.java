package com.practice.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("personBean")
public class Person implements Party {
}
