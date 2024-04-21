package system_design.design_patterns.structural.Bridge.withBridges;

import system_design.design_patterns.structural.Bridge.withBridges.breath.BreathImplementor;

public class Tree extends LivingThings {

    public Tree(BreathImplementor breathImplementor) {
        super(breathImplementor);
    }

    @Override
    public void breathProcess() {
        breathImplementor.breath();
    }
}
