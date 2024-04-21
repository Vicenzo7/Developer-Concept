package system_design.design_patterns.structural.Bridge.withBridges;

import system_design.design_patterns.structural.Bridge.withBridges.breath.BreathImplementor;

public abstract class LivingThings {

    BreathImplementor breathImplementor;

    public LivingThings(BreathImplementor breathImplementor) {
        this.breathImplementor = breathImplementor;
    }

    abstract public void  breathProcess();
}
