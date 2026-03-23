package com.example.SetterDependency_xmlconfig;

public class Student {
    private Address address;
    public void setAddress(Address address){
        this.address=address;
    }
    public void display(){
        address.display();
    }
}
