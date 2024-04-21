package system_design.design_patterns.behavioral.Visitor;

public interface RoomElement {
    void accept(RoomVisitor roomVisitor);
}
