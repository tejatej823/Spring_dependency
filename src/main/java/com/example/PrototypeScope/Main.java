package com.example.PrototypeScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        PrototypeScope bean1=context.getBean(PrototypeScope.class);
        PrototypeScope bean2=context.getBean(PrototypeScope.class);
        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(bean1==bean2);
        context.close();
    }
}
