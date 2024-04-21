package system_design.design_patterns.creational.factory;

public class MainClass {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        Shape rectangle = shapeFactory.getShape("RECTANGLE");

        circle.draw();
        rectangle.draw();

    }

}
