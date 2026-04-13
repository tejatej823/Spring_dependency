package com.example.Autowiring_setter_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    Engine engine;

    @Autowired
    public void setter_method(Engine engine){
        this.engine=engine;
    }
}
