package system_design.design_patterns.structural.Bridge.withBridges.breath;

public class WaterBreathImplementation implements BreathImplementor{
    @Override
    public void breath() {
        // Breath through GILLS
        // Inhale oxygen through water
        // Exhale carbon-dioxide
        System.out.println("Breathing through water");
    }
}
