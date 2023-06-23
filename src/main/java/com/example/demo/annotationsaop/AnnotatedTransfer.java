package com.example.demo.annotationsaop;

import org.springframework.stereotype.Component;

@Component
public class AnnotatedTransfer {


    @Loggable
    public void doAnnotatedTransfer(){
        System.out.println("i am doing annotated transfer");
    }
}
