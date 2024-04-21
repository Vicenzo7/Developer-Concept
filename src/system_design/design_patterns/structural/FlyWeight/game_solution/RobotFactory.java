package system_design.design_patterns.structural.FlyWeight.game_solution;

import system_design.design_patterns.structural.FlyWeight.game_problem.Sprites;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {


    Map<String, IRobot> robotObjectCache = new HashMap<>();

    public IRobot createRobot(String robotType) {
        if (robotObjectCache.containsKey(robotType)) {
            return robotObjectCache.get(robotType);
        } else if (robotType.equals("HUMANOID")) {
            Sprites humanSprites = new Sprites();
            HumanoidRobot humanoidRobot = new HumanoidRobot("HUMANOID", humanSprites);
            robotObjectCache.put(robotType, humanoidRobot);
        } else if (robotType.equals("ROBOTIC_DOG")) {
            Sprites dogSprites = new Sprites();
            RoboticDog roboticDog = new RoboticDog("ROBOTIC_DOG", dogSprites);
            robotObjectCache.put(robotType, roboticDog);
        }

        return null;
    }
}
