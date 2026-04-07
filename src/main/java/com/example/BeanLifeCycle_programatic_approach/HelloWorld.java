package com.example.BeanLifeCycle_programatic_approach;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
public class HelloWorld implements DisposableBean,InitializingBean{
    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("init method() called");
    }
    @Override
    public void destroy() throws Exception{
        System.out.println("destroy method() called");
    }
}


