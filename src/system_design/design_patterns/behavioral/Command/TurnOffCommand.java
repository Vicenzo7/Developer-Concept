package system_design.design_patterns.behavioral.Command;

public class TurnOffCommand implements Command {
    private AirConditioner airConditioner;

    public TurnOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();
    }

    @Override
    public void undo() {
        airConditioner.turnOn();
    }
}
