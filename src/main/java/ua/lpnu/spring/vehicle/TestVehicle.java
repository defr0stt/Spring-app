package ua.lpnu.spring.vehicle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.lpnu.spring.vehicle.cargo_ship.CargoShip;

public class TestVehicle
{
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationVehicle.xml");

        Vehicle vehicle = context.getBean("Train",Vehicle.class);
        System.out.println("\n" + vehicle.move());

        VehiclePark vehiclePark = context.getBean("VehiclePark", VehiclePark.class);
        System.out.println("Example1 = " + vehiclePark.getExample1());
        System.out.println("Example2 = " + vehiclePark.getExample2());
        System.out.println();

        System.out.println(vehiclePark.vehicleType(Type.CAR));
        System.out.println(vehiclePark.vehicleType(Type.PLANE));
        System.out.println();

        CargoShip cargoShip = context.getBean("CargoShip", CargoShip.class);
        System.out.println(cargoShip);

        Car car1 = context.getBean("Car", Car.class);
        Car car2 = context.getBean("Car", Car.class);
        System.out.println("car1.equals(car2) = " + (car1==car2) + "\n");

        context.close();
    }
}