package system_design.design_patterns.behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCaretaker {

    List<ConfigurationMemento> configurationMementos;

    public ConfigurationCaretaker() {
        configurationMementos = new ArrayList<>();
    }


    public void addMemento(ConfigurationMemento configurationMemento) {
        configurationMementos.add(configurationMemento);
    }

    public ConfigurationMemento undo() {
        if (configurationMementos.isEmpty()) {
            return null;
        }

        return configurationMementos.remove(configurationMementos.size() - 1);
    }
}
