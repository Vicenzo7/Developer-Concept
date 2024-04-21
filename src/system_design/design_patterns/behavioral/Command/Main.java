package system_design.design_patterns.behavioral.Command;

public class Main {
    public static void main(String[] args) {

        /*
            Look for more details
            https://notebook.zohopublic.in/public/notes/u3i1s7022b343ebda42819272312415abb520
        */

        //AC Object
        AirConditioner airConditioner = new AirConditioner();

        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(new TurnOnCommand(airConditioner));
        remoteController.pressButton();

        remoteController.setCommand(new IncreaseTemperatureCommand(airConditioner));
        remoteController.pressButton();
        remoteController.undo();

        remoteController.setCommand(new TurnOffCommand(airConditioner));
        remoteController.pressButton();
    }
}
