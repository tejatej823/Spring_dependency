package com.example.SetterDependency_annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Student s=context.getBean(Student.class);
        s.display();
    }
}
