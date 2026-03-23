package com.example.SetterDependency_xmlconfig;


public class HomeAddress implements Address{
    private String city;
    public void setCity(String city){
        this.city=city;
    }

    public void display(){
        System.out.println("City :"+city);
    }
    }

