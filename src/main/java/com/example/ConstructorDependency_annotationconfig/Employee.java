package com.example.ConstructorDependency_annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    Address address;
    @Autowired
    public Employee(Address address){
        this.address=address;
    }
    public void display_address(){
        address.show_address();
    }
}