package com.practice.spring.annotation;

import com.practice.spring.annotation.bean.Party;
import com.practice.spring.annotation.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AutowiredTester {


    Party party;

    @Autowired
    public void setParty(@Qualifier("orgBean") Party person) {
        this.party = person;
    }

    public Party getParty() {
        return party;
    }
}
