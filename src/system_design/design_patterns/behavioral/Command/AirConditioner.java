package system_design.design_patterns.behavioral.Command;

public class AirConditioner {
    private boolean turnOn;
    private int temperature = 16;

    public void turnOn() {
        turnOn = true;
        System.out.println("Air conditioner turned on");
    }

    public void turnOff() {
        turnOn = false;
        System.out.println("Air conditioner turned off");
    }

    public void increaseTemperature() {
        this.temperature += 1;
        System.out.println("Current temperature: " + temperature);
    }

    public void decreaseTemperature() {
        this.temperature -= 1;
        System.out.println("Current temperature: " + temperature);
    }
}
