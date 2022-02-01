package ua.lpnu.spring.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component("VehiclePark")
public class VehiclePark
{
//    @Autowired            //
//    @Qualifier("Car")     // can use like this
    private Vehicle vehicle1;
    private Vehicle vehicle2;

    @Autowired
    public VehiclePark(@Qualifier("Car") Vehicle vehicle1,
                       @Qualifier("Plane") Vehicle vehicle2){
        this.vehicle1 = vehicle1;
        this.vehicle2 = vehicle2;
    }

    public String vehicleType(Type type) {
        Random random = new Random();
        int a = random.nextInt(3);
        List<String> list;
        if (type == Type.CAR){
            list = vehicle1.move();
            return list.get(a);
        } else {
            list = vehicle2.move();
            return list.get(a);
        }
    }
}

enum Type
{
    CAR, PLANE
}