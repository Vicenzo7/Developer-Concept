package system_design.design_patterns.behavioral.Visitor;

public class RoomPricingVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Pricing computation logic of SingleRoom");
        singleRoom.price = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Pricing computation logic of DoubleRoom");
        doubleRoom.price = 2000;
    }

    @Override
    public void visit(DeluxRoom deluxRoom) {
        System.out.println("Pricing computation logic of DeluxRoom");
        deluxRoom.price = 3000;
    }
}
