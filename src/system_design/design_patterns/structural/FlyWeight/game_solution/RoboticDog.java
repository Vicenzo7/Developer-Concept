package system_design.design_patterns.structural.FlyWeight.game_solution;

import system_design.design_patterns.structural.FlyWeight.game_problem.Sprites;

public class RoboticDog implements IRobot {


    private String type;
    private Sprites sprites;

    public RoboticDog(String type, Sprites sprites) {
        this.type = type;
        this.sprites = sprites;
    }

    public String getType() {
        return type;
    }

    public Sprites getSprites() {
        return sprites;
    }

    @Override
    public void display(int x, int y) {
        // use sprites and the provided co-ordinated to render the image;
    }
}
