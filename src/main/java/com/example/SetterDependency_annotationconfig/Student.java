package com.example.SetterDependency_annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    Address address;

    @Autowired
    public void setAddress(Address address){
        this.address=address;
    }

    public void display(){
        address.showAddress();
    }
}
