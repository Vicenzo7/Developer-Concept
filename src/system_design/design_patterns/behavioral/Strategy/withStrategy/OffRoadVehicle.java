package system_design.design_patterns.behavioral.Strategy.withStrategy;

import system_design.design_patterns.behavioral.Strategy.withStrategy.drive.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
