package system_design.design_patterns.structural.Decorator;

import system_design.design_patterns.structural.Decorator.decorator.ExtraCheese;
import system_design.design_patterns.structural.Decorator.decorator.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza farmHousePlusCheesePizza = new ExtraCheese(new Farmhouse());
        System.out.println(farmHousePlusCheesePizza.getCost());

        BasePizza farmHousePlusCheesePlusMushroom = new Mushroom(farmHousePlusCheesePizza);
        System.out.println(farmHousePlusCheesePlusMushroom.getCost());

        BasePizza basePizza = new ExtraCheese(farmHousePlusCheesePlusMushroom);
        System.out.println(basePizza.getCost());
    }
}
