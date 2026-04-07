package com.example.BeanLifeCycle_annotation_approach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Helloworld {
    @PostConstruct
    public void init(){
        System.out.println("init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy method");
    }
}
