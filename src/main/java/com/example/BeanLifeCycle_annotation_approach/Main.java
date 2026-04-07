package com.example.BeanLifeCycle_annotation_approach;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        context.close();
    }
}
