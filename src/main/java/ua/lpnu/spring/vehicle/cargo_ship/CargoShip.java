package ua.lpnu.spring.vehicle.cargo_ship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.lpnu.spring.vehicle.VehiclePark;

@Component("CargoShip")
public class CargoShip
{
    private int id;
    private VehiclePark vehiclePark;

    @Autowired
    public CargoShip(VehiclePark vehiclePark) {
        this.id = 1;
        this.vehiclePark = vehiclePark;
    }

    @Override
    public String toString() {
        return "CargoShip{" +
                " id = " + id +
                " }";
    }
}