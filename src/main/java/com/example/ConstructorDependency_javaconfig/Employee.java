package com.example.ConstructorDependency_javaconfig;

public class Employee {
    Address address;
    public Employee(Address address){
        this.address=address;
    }
    public void display_address(){
        address.show_address();
    }
}
