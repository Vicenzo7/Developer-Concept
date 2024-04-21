package system_design.design_patterns.behavioral.Strategy.withoutStrategy;

public class SportsVehicle extends Vehicle{
    @Override
    public void drive() {
        // different drive logic

        /*
            Issue: Off road class and sports class have same functionality, this is not with parent.
            So code is duplicated here.
        */
        System.out.println("sports drive capability");
    }
}
