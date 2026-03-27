package com.example.ConstructorDependency_annotationconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HomeAddress implements Address{
    @Value("Siva-nagar")
    String city;
    public void show_address(){
        System.out.println("City "+city);
    }
}
