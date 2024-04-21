package system_design.design_patterns.behavioral.Command;

public class TurnOnCommand implements Command {
    private AirConditioner airConditioner;

    public TurnOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }

    @Override
    public void undo() {
        airConditioner.turnOff();
    }
}
