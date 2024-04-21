package system_design.design_patterns.behavioral.Strategy.withStrategy;

import system_design.design_patterns.behavioral.Strategy.withStrategy.drive.SportDriveStrategy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
        super(new SportDriveStrategy());
    }
}
