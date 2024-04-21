package system_design.design_patterns.behavioral.Strategy.withStrategy.drive;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}
