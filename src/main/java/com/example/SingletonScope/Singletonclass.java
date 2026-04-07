package com.example.SingletonScope;

import org.springframework.stereotype.Component;

@Component
public class Singletonclass {
    public void viewmessage(){
        System.out.println("Singleton class object at location : "+this);
    }
}
