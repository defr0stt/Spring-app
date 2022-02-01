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
        System.out.println(vehiclePark.vehicleType(Type.CAR));
        System.out.println(vehiclePark.vehicleType(Type.PLANE));
        System.out.println();

        CargoShip cargoShip = context.getBean("CargoShip", CargoShip.class);
        System.out.println(cargoShip);

        context.close();
    }
}