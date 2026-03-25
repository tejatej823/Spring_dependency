package com.example.ConstructorDependency_annotationconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.ConstructorDependency_annotationconfig")
public class AppConfig {

}
