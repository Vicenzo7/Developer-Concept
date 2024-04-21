package system_design.design_patterns.behavioral.Visitor;

public interface RoomVisitor {
    void visit(SingleRoom singleRoom);

    void visit(DoubleRoom doubleRoom);

    void visit(DeluxRoom deluxRoom);

}
