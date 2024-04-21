package system_design.design_patterns.creational.abstractFactory;

public class LuxuryCarFactory implements AbstractFactory{
    @Override
    public Car getInstance(int price) {
        if (price <= 60000) {
            return new LuxuryCar2();
        } else if (price <= 80000) {
            return new LuxuryCar1();
        }
        return null;

    }
}
