package system_design.LLD.Car_Rental_System;

import system_design.LLD.Car_Rental_System.product.Vehicle;

import java.util.List;

public class VehicleInventoryManagement {


    List<Vehicle> vehicles;

    public VehicleInventoryManagement(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        // filtering
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
