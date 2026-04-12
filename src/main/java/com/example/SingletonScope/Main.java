package com.example.SingletonScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Singletonclass bean1=context.getBean(Singletonclass.class);
        Singletonclass bean2=context.getBean(Singletonclass.class);
        Singletonclass bean3=context.getBean(Singletonclass.class);
        bean1.viewmessage();
        bean2.viewmessage();
        System.out.println(bean1==bean2);
        System.out.println(bean2==bean3);
    }
}
