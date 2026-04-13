package com.example.Autowiring_constructor_injection;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public void start(){
        System.out.println("Engine Starts");
    }
}
