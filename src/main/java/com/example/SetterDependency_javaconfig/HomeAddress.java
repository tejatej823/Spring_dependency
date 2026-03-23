package com.example.SetterDependency_javaconfig;

public class HomeAddress implements Address{
    private String city;
    public void setCity(String city){
        this.city=city;
    }

    @Override
    public void display() {
        System.out.println("City: "+city);
    }
}
