package come.codehub.spring.codehubpropertiesdemo;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration("classpath:application-context.xml")
public class CodehubPropertiesDemoApplicationTests {

    @Autowired
    private Environment env;

    @Value("${key.something}")
    private String injectedProperty;

    @Test
    public void givenContext_noException() {
        System.out.println("value injected via @Value:" + injectedProperty);
        System.out.println("value injected via @Value:" + env.getProperty("key.something"));
    }

}
