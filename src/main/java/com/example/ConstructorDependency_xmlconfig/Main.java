package com.example.ConstructorDependency_xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Shopping_item item=context.getBean("shoppingitem",Shopping_item.class);
        item.display_payment_type();
    }
}
