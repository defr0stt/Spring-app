package ua.lpnu.spring.vehicle;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component("Plane")
public class Plane implements Vehicle
{
    @Override
    public List<String> move() {
        return new ArrayList(Arrays.asList("I'm a plane : psh-psh",
                "I'm so expensive",
                "I can fly"));
    }
}