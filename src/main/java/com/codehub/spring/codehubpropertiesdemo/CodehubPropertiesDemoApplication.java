package com.codehub.spring.codehubpropertiesdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.List;

@SpringBootApplication
public class CodehubPropertiesDemoApplication implements CommandLineRunner {

    @Value("${key.something}")
    private String injectedProperty;

    @Value("${key.list}")
    private List<Integer> integerList;

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(CodehubPropertiesDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("In main app value injected via @Value:" + injectedProperty);
        System.out.println("In main app value injected via Environment:" + env.getProperty("key.something"));
        System.out.println("In main app values list injected via @Value:" + integerList);
    }
}
