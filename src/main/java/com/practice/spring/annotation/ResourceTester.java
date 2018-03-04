package com.practice.spring.annotation;

import com.practice.spring.annotation.bean.Party;
import com.practice.spring.annotation.bean.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ResourceTester {

    Party person;

    @Resource(name = "person")
    public void setParty( @Qualifier("orgBean") Party person) {
        this.person = person;
    }

    public Party getParty() {
        return person;
    }
}
