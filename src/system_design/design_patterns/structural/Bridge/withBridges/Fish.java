package system_design.design_patterns.structural.Bridge.withBridges;

import system_design.design_patterns.structural.Bridge.withBridges.breath.BreathImplementor;

public class Fish extends LivingThings{

    public Fish(BreathImplementor breathImplementor) {
        super(breathImplementor);
    }

    @Override
    public void breathProcess() {
        breathImplementor.breath();
    }
}
