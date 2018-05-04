package come.codehub.spring.codehubpropertiesdemo;

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

    @Value("${app.name}")
    private String appName;

    @Value("${app.description}")
    private String description;


    @Test
    public void givenContext_noException() {
        assertEquals(env.getProperty("app.name"),appName);
    }

}
