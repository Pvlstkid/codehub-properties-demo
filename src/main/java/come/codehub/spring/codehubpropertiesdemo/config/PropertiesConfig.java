package come.codehub.spring.codehubpropertiesdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
@PropertySource("classpath:bar.properties")
//@PropertySources({@PropertySource("classpath:bar.properties"), @PropertySource("classpath:foo.properties")})
public class PropertiesConfig {

    public PropertiesConfig() {
        super();
    }

    /*
        The PropertySourcesPlaceholderConfigurer is used to programmatically register more than one
        property files in the context. It does not registers properties to Environment like @PropertySource
        With Spring 4.3 you do not need to explicitly define PropertySourcesPlaceholderConfigurer Bean for @Value
        injections to be resolved.
     */

/*    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer pspc  = new PropertySourcesPlaceholderConfigurer();
        Resource[] resources = new ClassPathResource[ ]
                { new ClassPathResource( "foo.properties" ) };
        pspc.setLocations( resources );
        pspc.setIgnoreUnresolvablePlaceholders( true );
        return pspc;
    }*/
}
