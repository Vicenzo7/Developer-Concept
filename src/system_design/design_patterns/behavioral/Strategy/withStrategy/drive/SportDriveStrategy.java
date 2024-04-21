package system_design.design_patterns.behavioral.Strategy.withStrategy.drive;

public class SportDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("sport drive capability");
    }
}
