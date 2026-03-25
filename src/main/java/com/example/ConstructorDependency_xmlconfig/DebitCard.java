package com.example.ConstructorDependency_xmlconfig;

public class DebitCard implements Payment{
    String payment_name;
    public DebitCard(String payment_name){
        this.payment_name=payment_name;
    }
    public void pay(){
        System.out.println("Payment done using "+payment_name);
    }
}
