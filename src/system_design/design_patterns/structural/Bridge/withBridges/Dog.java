package system_design.design_patterns.structural.Bridge.withBridges;

import system_design.design_patterns.structural.Bridge.withBridges.breath.BreathImplementor;

public class Dog extends LivingThings{

    public Dog(BreathImplementor breathImplementor) {
        super(breathImplementor);
    }

    @Override
    public void breathProcess() {
        breathImplementor.breath();
    }
}
