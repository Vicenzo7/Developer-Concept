package system_design.design_patterns.behavioral.Visitor;

public class RoomMaintenanceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Performing Maintenance of SingleRoom");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Performing Maintenance of DoubleRoom");
    }

    @Override
    public void visit(DeluxRoom deluxRoom) {
        System.out.println("Performing Maintenance of DeluxRoom");
    }
}
