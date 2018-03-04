package com.practice.spring;

import com.practice.spring.annotation.AutowiredTester;
import com.practice.spring.annotation.InjectTester;
import com.practice.spring.annotation.ResourceTester;
import com.practice.spring.aop.bean.Circle;
import com.practice.spring.aop.bean.Triangle;
import com.practice.spring.configuration.Config;
import com.practice.spring.configuration.bean.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {
        "com.practice.spring.*"
})
// Enable AspectJ through configuration class
@EnableAspectJAutoProxy
public class Application {

    public static void main(String args[])
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class, Application.class);
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");

        obj.printHelloWorld("Spring3 Java Config");

        AutowiredTester autowiredTester = context.getBean(AutowiredTester.class);
        InjectTester injectTester = context.getBean(InjectTester.class);
        ResourceTester resourceTester = context.getBean(ResourceTester.class);

        System.out.println(autowiredTester.getParty());
        System.out.println(injectTester.getParty());
        System.out.println(resourceTester.getParty());


        Circle circle = (Circle) context.getBean(Circle.class);
        System.out.println(circle.getName());

        Triangle triangle = (Triangle) context.getBean(Triangle.class);
        System.out.println(circle.getName());
    }
}
