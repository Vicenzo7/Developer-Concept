package system_design.design_patterns.behavioral.Memento;

public class Main {
    public static void main(String[] args) {
        ConfigurationCaretaker configurationCaretaker = new ConfigurationCaretaker();

        ConfigurationOriginator configurationOriginator = new ConfigurationOriginator();
        configurationOriginator.setHeight(5);
        configurationOriginator.setWeight(10);

        // take snapshot and save it
        ConfigurationMemento configurationMemento = configurationOriginator.createConfigurationMemento();
        configurationCaretaker.addMemento(configurationMemento);

        configurationOriginator.setHeight(7);
        configurationOriginator.setWeight(12);

        // take snapshot and save it
        configurationMemento = configurationOriginator.createConfigurationMemento();
        configurationCaretaker.addMemento(configurationMemento);

        configurationOriginator.setHeight(9);
        configurationOriginator.setWeight(15);

        System.out.println("Height : " + configurationOriginator.getHeight() + " Weight : " + configurationOriginator.getWeight());

        // restore the snapshot and create it
        ConfigurationMemento restoredMemento = configurationCaretaker.undo();
        configurationOriginator.restoreMemento(restoredMemento);
        System.out.println("Height : " + configurationOriginator.getHeight() + " Weight : " + configurationOriginator.getWeight());

    }
}
