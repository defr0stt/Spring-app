package ua.lpnu.spring.vehicle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component("Train")
@Scope("prototype")
public class Train implements Vehicle
{
    @Override
    public List<String> move() {
        return new ArrayList(Arrays.asList("I'm a train : tu-tu",
                "I'm so expensive",
                "I'm large"));
    }
}