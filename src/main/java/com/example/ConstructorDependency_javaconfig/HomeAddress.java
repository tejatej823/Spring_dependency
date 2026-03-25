package com.example.ConstructorDependency_javaconfig;

public class HomeAddress implements Address{
    String city;
    public HomeAddress(String city){
        this.city=city;
    }
    public void show_address(){
        System.out.println("Home city:"+city);
    }
}
