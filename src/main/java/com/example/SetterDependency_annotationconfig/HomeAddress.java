package com.example.SetterDependency_annotationconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HomeAddress implements Address{

    @Value("Hyderabad")
    private String city;

    public void showAddress(){
        System.out.println("City : "+city);
    }
}
