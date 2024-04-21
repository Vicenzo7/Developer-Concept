package system_design.design_patterns.structural.Adapter.adapter;

import system_design.design_patterns.structural.Adapter.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

    private WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        return 0.45 * weightMachine.getWeightInPounds();
    }

    /*
        1 pound  = 0.45 kg
        weightInPound = x
        x = weightInPound * 0.45
    */
}
