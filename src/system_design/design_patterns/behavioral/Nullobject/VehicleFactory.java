package system_design.design_patterns.behavioral.Nullobject;

public class VehicleFactory {

    public static Vehicle getVehicleObject(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("car")) {
            return new Car();
        }

        return new NullVehicle();
    }
}
