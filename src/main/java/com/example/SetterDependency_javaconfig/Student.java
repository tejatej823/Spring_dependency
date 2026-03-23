package com.example.SetterDependency_javaconfig;

public class Student {
    private Address address;
    public void setAddress(Address address){
        this.address=address;
    }
    public void show(){
        address.display();
    }
}
