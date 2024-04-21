package system_design.design_patterns.behavioral.Strategy.withStrategy;

public class Main {


    public static void main(String[] args) {

        /*

            Strategy Pattern helps to define multiple algorithms for the task, and
            we can select any algorithm depending on the situation.

            When to use strategy pattern

            When the two or more child classes have same function but that functionality is not
            there with the parent then use the strategy pattern(Behavioural)

        */

        Vehicle nv = new NormalVehicle();
        nv.drive();

        Vehicle sv = new SportsVehicle();
        sv.drive();

        Vehicle gv = new GoodsVehicle();
        gv.drive();

        Vehicle ovr = new OffRoadVehicle();
        ovr.drive();
    }
}
