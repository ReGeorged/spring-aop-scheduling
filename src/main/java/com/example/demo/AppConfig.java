package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
// OR @ComponentScan(basePackages = "com.example.demo..")
// WORKS WITHOUT BELOW
//@EnableAspectJAutoProxy
public class AppConfig {
}
