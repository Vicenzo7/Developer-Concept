package system_design.design_patterns.behavioral.Strategy.withStrategy;

import system_design.design_patterns.behavioral.Strategy.withStrategy.drive.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
