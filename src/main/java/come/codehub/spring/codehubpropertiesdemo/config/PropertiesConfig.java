package come.codehub.spring.codehubpropertiesdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@Configuration
@PropertySource("classpath:bar.properties")
//@PropertySources({@PropertySource("classpath:bar.properties"), @PropertySource("classpath:foo.properties")})
public class PropertiesConfig {

    public PropertiesConfig() {
        super();
    }

    /*
        The PropertySourcesPlaceholderConfigurer is used to programmatically register more than one
        property files in the context. It does not add properties to Environment like @PropertySource
     */

/*    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setLocation(new ClassPathResource("foo.properties"));
        return configurer;
    }*/
}
