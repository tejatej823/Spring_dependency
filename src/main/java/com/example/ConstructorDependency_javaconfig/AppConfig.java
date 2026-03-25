package com.example.ConstructorDependency_javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Address address(){
        return new HomeAddress("Dharmavaram");
    }
    @Bean
    public Employee employee(){
        return new Employee(address());
    }
}
