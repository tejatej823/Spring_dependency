package com.example.Autowiring_setter_injection;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public void start(){
        System.out.println("Engine started");
    }
}
