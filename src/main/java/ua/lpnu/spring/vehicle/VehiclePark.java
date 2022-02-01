package ua.lpnu.spring.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;

@Component("VehiclePark")
public class VehiclePark
{
//    @Autowired            //
//    @Qualifier("Car")     // can use like this

    private Vehicle vehicle1;
    private Vehicle vehicle2;

    @Value("${vehiclePark.example1}")
    private int example1;
    @Value("2")
    private int example2;

    @Autowired
    public VehiclePark(@Qualifier("Car") Vehicle vehicle1,
                       @Qualifier("Plane") Vehicle vehicle2){
        this.vehicle1 = vehicle1;
        this.vehicle2 = vehicle2;
    }

    public int getExample1() {
        return example1;
    }

    public int getExample2() {
        return example2;
    }

    @PostConstruct
        public void myInit(){
        System.out.println("Initialization...");
    }

    @PreDestroy
    public void myDestroy(){
        System.out.println("Destroying...");
    }

    public String vehicleType(Type type) {
        Random random = new Random();
        int a = random.nextInt(3);
        List<String> list;
        if (type == Type.CAR) {
            list = vehicle1.move();
        } else {
            list = vehicle2.move();
        }
        return type + " - " + list.get(a);
    }
}

enum Type
{
    CAR, PLANE
}