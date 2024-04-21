package system_design.design_patterns.behavioral.Nullobject;

public class Car implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 100;
    }

    @Override
    public int getSeatingCapacity() {
        return 4;
    }
}
