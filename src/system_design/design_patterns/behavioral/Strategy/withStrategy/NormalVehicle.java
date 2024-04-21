package system_design.design_patterns.behavioral.Strategy.withStrategy;

import system_design.design_patterns.behavioral.Strategy.withStrategy.drive.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{

    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
