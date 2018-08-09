package com.qs.spring_aop_demo;

/**
 * 切面类（周边业务类）
 */

public class CarLogger {

//    前置通知

    public void beforeRun(){
        System.out.println("car is going to run~");
    }



//    后置通知

    public void afterRun(){
        System.out.println("car is running~");
    }
}
