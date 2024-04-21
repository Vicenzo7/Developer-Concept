package system_design.design_patterns.behavioral.Command;

public class IncreaseTemperatureCommand implements Command {
    private AirConditioner airConditioner;

    public IncreaseTemperatureCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.increaseTemperature();
    }

    @Override
    public void undo() {
        airConditioner.decreaseTemperature();
    }
}
