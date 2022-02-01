package ua.lpnu.spring.vehicle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component("Car")
@Scope("prototype")
public class Car implements Vehicle
{
    @Override
    public List<String> move() {
        return new ArrayList(Arrays.asList("I'm a car : br-br-br",
                "I'm not so expensive",
                "I'm not so big"));
    }
}