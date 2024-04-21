package system_design.design_patterns.structural.Adapter;

import system_design.design_patterns.structural.Adapter.adaptee.WeightMachineForBabies;
import system_design.design_patterns.structural.Adapter.adapter.WeightMachineAdapter;
import system_design.design_patterns.structural.Adapter.adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {


        WeightMachineAdapter weightMachineAdapter =
                new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
