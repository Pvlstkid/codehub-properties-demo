package come.codehub.spring.codehubpropertiesdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySource("classpath:bar.properties")
//@PropertySources({@PropertySource("classpath:bar.properties"), @PropertySource("classpath:foo.properties")})
public class PropertiesConfig {

    public PropertiesConfig() {
        super();
    }
}
