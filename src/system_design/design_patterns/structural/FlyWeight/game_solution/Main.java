package system_design.design_patterns.structural.FlyWeight.game_solution;

public class Main {
    public static void main(String[] args) {
        RobotFactory robotFactory = new RobotFactory();

        IRobot humanoid = robotFactory.createRobot("HUMANOID");
        humanoid.display(10, 16);

        IRobot roboticDog = robotFactory.createRobot("ROBOTIC_DOG");
        roboticDog.display(18,20);

        IRobot humanoid1 = robotFactory.createRobot("HUMANOID");
        humanoid1.display(8, 10);

        IRobot roboticDog2 = robotFactory.createRobot("ROBOTIC_DOG");
        roboticDog2.display(20,30);
    }
}
