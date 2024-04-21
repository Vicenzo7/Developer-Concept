package system_design.design_patterns.structural.Bridge.withBridges.breath;

public class TreeBreathImplementation implements BreathImplementor{
    @Override
    public void breath() {
        // Breath through LEAVES
        // Inhale carbon dioxide
        // Exhale oxygen through photosynthesis
        System.out.println("Breathing through tree");

    }
}
