package com.example.Autowiring_constructor_injection;

import org.springframework.stereotype.Component;

@Component
public class Car {
    Engine engine;
    public Car(Engine engine){
        this.engine=engine;
    }
}
