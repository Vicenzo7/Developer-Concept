package system_design.design_patterns.structural.Adapter.adaptee;

public class WeightMachineForBabies implements WeightMachine{
    @Override
    public double getWeightInPounds() {
        return 28;
    }
}
