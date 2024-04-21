package system_design.design_patterns.behavioral.Visitor;

public class SingleRoom implements RoomElement{

    double price;

    @Override
    public void accept(RoomVisitor roomVisitor) {
        roomVisitor.visit(this);
    }
}
