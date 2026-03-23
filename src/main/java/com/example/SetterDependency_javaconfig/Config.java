package com.example.SetterDependency_javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
     @Bean
     public Address address(){
         HomeAddress address=new HomeAddress();
         address.setCity("Hyderabad");
         return address;
     }
     @Bean
     public Student student() {
         Student s = new Student();
         s.setAddress(address());  // Dependency injected here
         return s;
     }
}
