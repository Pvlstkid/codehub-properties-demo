package com.codehub.spring.codehubpropertiesdemo;

import com.codehub.spring.codehubpropertiesdemo.config.PropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.Map;

@SpringBootApplication
public class CodehubPropertiesDemoApplication implements CommandLineRunner {

    @Autowired
    private PropertiesConfig propertiesConfig;

    public static void main(String[] args) {
        SpringApplication.run(CodehubPropertiesDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("*--------Config Object-------*");
        System.out.println("Simple Values");
        System.out.println(propertiesConfig.getHost());
        System.out.println(propertiesConfig.getPort());
        System.out.println("Additional Header Values");
        for (Map.Entry<String, String>  entry :
                propertiesConfig.getAdditionalHeaders().entrySet()) {
            System.out.println(entry);
        }

        System.out.println(propertiesConfig.getCredentials().getUsername());
        System.out.println(propertiesConfig.getCredentials().getPassword());
        System.out.println(propertiesConfig.getCredentials().getAuthMethod());
    }
}
