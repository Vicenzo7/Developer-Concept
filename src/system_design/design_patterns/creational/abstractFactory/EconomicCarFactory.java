package system_design.design_patterns.creational.abstractFactory;

public class EconomicCarFactory implements AbstractFactory {

    @Override
    public Car getInstance(int price) {
        if (price <= 30000) {
            return new EconomyCar2();
        } else if (price <= 60000) {
            return new EconomyCar1();
        }
        return null;

    }
}
