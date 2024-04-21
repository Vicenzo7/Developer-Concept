package system_design.design_patterns.structural.FlyWeight.game_problem;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        // create 5 lakh human robots
        for (int i = 0; i < 500000; i++) {
            Sprites humanoidSprites = new Sprites();
            Robot humunoidRobot = new Robot(x + i, y + i, "HUMANOID", humanoidSprites);
        }
        // create 5 lakh animal robots
        for (int i = 0; i < 500000; i++) {
            Sprites dogSprite = new Sprites();
            Robot dogRobot = new Robot(x + i, y + i, "ROBOTICS_DOGS", dogSprite);
        }
    }
}
