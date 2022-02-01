package ua.lpnu.spring.solo_java_configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.lpnu.spring.vehicle.Car;
import ua.lpnu.spring.vehicle.Vehicle;

import static java.lang.System.out;

public class TestJavaConf
{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfiguration.class);

        Vehicle vehicle = context.getBean("car", Car.class);

        out.println(vehicle.move());

        context.close();
    }
}