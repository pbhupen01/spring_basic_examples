package com.practice.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("orgBean")
public class Organization implements Party {

}
