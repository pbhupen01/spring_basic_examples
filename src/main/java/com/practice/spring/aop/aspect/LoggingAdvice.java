package com.practice.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * This is an Aspect class
 */
@Aspect
// Always required for spring to find this class
@Component
public class LoggingAdvice {

    /**
     * This is an advice from aspect
     */
    // This will be called before all getName() method in any class
    //@Before("execution(public String getName())")
    // This will be called before Circle getName() method
    //@Before("execution(public String com.practice.spring.aop.bean.Circle.getName())")
    @Pointcut("execution(public String getName())")
    public void logAdvice()
    {
        System.out.println("Logging Advice: get called");
    }
}
