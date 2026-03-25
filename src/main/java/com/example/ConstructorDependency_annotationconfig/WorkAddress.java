package com.example.ConstructorDependency_annotationconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WorkAddress implements Address{
    @Value("Chennai")
    String city;
    public void show_address(){
        System.out.println("City "+city);
    }
}
