package com.example.PrototypeScope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeScope {
    public PrototypeScope(){
        System.out.println("PrototypeScope");
    }
    @PostConstruct
    public void init(){
        System.out.println("Init Method called");
    }
    @PreDestroy
    public void destroy(){
        System.out.print("Destroy Method called");
    }
}
