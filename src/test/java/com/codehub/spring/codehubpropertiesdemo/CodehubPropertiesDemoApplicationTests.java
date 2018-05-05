package com.codehub.spring.codehubpropertiesdemo;

import com.codehub.spring.codehubpropertiesdemo.config.PropertiesConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CodehubPropertiesDemoApplicationTests {

    @Autowired
    private Environment env;


    @Autowired
    private PropertiesConfig propertiesConfig;


    @Test
    public void givenContext_noException() {
        assertEquals(env.getProperty("mail.host"),propertiesConfig.getHost());
    }

}
