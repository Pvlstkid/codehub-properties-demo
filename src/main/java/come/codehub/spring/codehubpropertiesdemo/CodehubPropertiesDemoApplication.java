package come.codehub.spring.codehubpropertiesdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class CodehubPropertiesDemoApplication implements CommandLineRunner {

    @Value("${app.name}")
    private String appName;

    @Value("${app.description}")
    private String description;

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(CodehubPropertiesDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application's name is: " + appName);
        System.out.println(description);
    }
}
