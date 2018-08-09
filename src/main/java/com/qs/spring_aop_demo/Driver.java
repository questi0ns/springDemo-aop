package com.qs.spring_aop_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext
                ("src/applicationContext.xml");

        Car car = (Car) context.getBean("car");

        car.go();
    }
}
