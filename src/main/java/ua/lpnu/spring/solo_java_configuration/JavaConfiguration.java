package ua.lpnu.spring.solo_java_configuration;

import org.springframework.context.annotation.*;
import ua.lpnu.spring.vehicle.Car;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static java.lang.System.*;

// similar to empty .xml file
@Configuration
@ComponentScan("ua.lpnu.spring.vehicle")                // component-scan base-package="ua.lpnu.spring.vehicle"
@PropertySource("classpath:vehiclePark.properties")     // context:property-placeholder
public class JavaConfiguration
{
    @Bean
    @Scope("prototype")
    public Car car(){
        return new Car();
    }

    @PostConstruct
    public void myInit(){
        out.println("  -- Initialization --");
    }

    @PreDestroy
    public void myDestroy(){
        out.println("  -- Destroying --");
    }
}