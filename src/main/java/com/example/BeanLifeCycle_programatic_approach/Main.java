package com.example.BeanLifeCycle_programatic_approach;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        context.close();
    }
}
