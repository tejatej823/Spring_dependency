package com.example.ConstructorDependency_javaconfig;

public class WorkAddress implements Address{
    String city;
    public WorkAddress(String city){
        this.city=city;
    }
    public void show_address(){
        System.out.println("Work address : "+city);
    }
}
