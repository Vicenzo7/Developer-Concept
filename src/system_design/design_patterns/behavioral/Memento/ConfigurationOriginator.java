package system_design.design_patterns.behavioral.Memento;

public class ConfigurationOriginator {

    private int height;
    private int weight;


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ConfigurationMemento createConfigurationMemento() {
        return new ConfigurationMemento(this.height, this.weight);
    }

    public void restoreMemento(ConfigurationMemento configurationMemento) {
        this.height = configurationMemento.getHeight();
        this.weight = configurationMemento.getWeight();
    }
}
