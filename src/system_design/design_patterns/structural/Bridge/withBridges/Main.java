package system_design.design_patterns.structural.Bridge.withBridges;


import system_design.design_patterns.structural.Bridge.withBridges.breath.LandBreathImplementation;

public class Main {
    public static void main(String[] args) {
        LivingThings livingThings = new Dog(new LandBreathImplementation());
        livingThings.breathProcess();
    }
}
