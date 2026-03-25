package com.example.ConstructorDependency_xmlconfig;

public class Shopping_item {
    Payment payment;
    Shopping_item(Payment payment){
        this.payment=payment;
    }
    public void availablePaymentOption(Payment payment){
        this.payment=payment;
    }
    public void display_payment_type(){
        payment.pay();
    }
}
