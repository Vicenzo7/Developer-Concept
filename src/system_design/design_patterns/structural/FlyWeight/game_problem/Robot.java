package system_design.design_patterns.structural.FlyWeight.game_problem;

public class Robot {
    private int xCoordinate;
    private int yCoordinate;
    private String type;
    private Sprites sprite; // small 2d array to add image to the robot

    public Robot(int xCoordinate, int yCoordinate, String type, Sprites sprite) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.type = type;
        this.sprite = sprite;
    }
}
