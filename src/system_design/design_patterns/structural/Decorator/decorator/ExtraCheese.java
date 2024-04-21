package system_design.design_patterns.structural.Decorator.decorator;

import system_design.design_patterns.structural.Decorator.BasePizza;

public class ExtraCheese extends ToppingDecorator {

    private BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return basePizza.getCost() + 20;
    }
}
