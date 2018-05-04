package come.codehub.spring.codehubpropertiesdemo;

import come.codehub.spring.codehubpropertiesdemo.config.PropertiesConfig;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration(classes = {PropertiesConfig.class}, loader = AnnotationConfigContextLoader.class)
public class CodehubPropertiesDemoApplicationTests {

    @Autowired
    private Environment env;

    @Value("${key.something}")
    private String injectedProperty;

    @Value("${key.list}")
    private List<Integer> integerList;

    @Test
    public void givenContext_noException() {
        System.out.println("value injected via @Value:" + injectedProperty);
        System.out.println("value injected via Environment:" + env.getProperty("key.something"));
        System.out.println("In main app values list injected via @Value:" + integerList);
    }

}
