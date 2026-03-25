package com.example.ConstructorDependency_xmlconfig;

public class CreditCard implements Payment {
    String payment_name;
    public CreditCard(String payment_name){
        this.payment_name=payment_name;
    }
    public void pay(){
        System.out.println("Payment done using "+payment_name);
    }
}
