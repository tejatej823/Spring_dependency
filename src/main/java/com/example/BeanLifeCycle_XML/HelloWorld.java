package com.example.BeanLifeCycle_XML;
public class HelloWorld{
    public void init(){
        System.out.println("Bean initiation done");
    }
    public void destroy(){
        System.out.println("Bean has been destroyed");
    }
}