package system_design.design_patterns.creational.abstractFactory;

public class AbstractFactoryProducer {

    public AbstractFactory getFactory(String factoryName) {
        if (factoryName.equals("Economy")) {
            return new EconomicCarFactory();
        }

        if (factoryName.equals("Luxury")) {
            return new LuxuryCarFactory();
        }

        return null;
    }


    public static void main(String[] args) {

        /*
            Abstract Factory Pattern : Factory of Factories

        */

        AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
        AbstractFactory economy = abstractFactoryProducer.getFactory("Economy");
        AbstractFactory luxury = abstractFactoryProducer.getFactory("Luxury");

        System.out.println(economy.getInstance(25000).getTopSpeed());
        System.out.println(luxury.getInstance(70000).getTopSpeed());
    }
}
