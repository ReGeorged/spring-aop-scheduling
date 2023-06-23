package com.example.demo;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AspectLogger {



    // TODO - DID NOT WORK
//    @Before("args(fancyArgs)")
//    public void doLogging(String fancyArgs){
//        System.out.println("argument passed was : " +fancyArgs);
//        System.out.println(" i am behind");
//    }


    @Around("allDos()")
    public void around(JoinPoint joinPoint){
        System.out.println("around all do methods");
        System.out.println(Arrays.toString(joinPoint.getArgs()));
    }
    @After("transferClassCut()")
    public void after(JoinPoint joinPoint){
        //method args
        System.out.println(Arrays.toString(joinPoint.getArgs()));

        //Method signature
        System.out.println(joinPoint.toString());

        //who triggered pointcut extract the object
        Object triggerer = (Object) joinPoint.getTarget();

        System.out.println("after Transfer class ");
    }


    //METHODS
    @Pointcut("execution(*  doTransfer(..))")
    public void allDos(){}


    // CLASSES
    @Pointcut("within(com.example.demo.ScheduledTransferModule)")
    public void transferClassCut(){

    }
}
