package system_design.design_patterns.structural.Bridge.withBridges.breath;

public class LandBreathImplementation implements BreathImplementor{
    @Override
    public void breath() {
        // Breath through NOSE
        // Inhale oxygen through air
        // Exhale carbon-dioxide
        System.out.println("Breathing through land");
    }
}
