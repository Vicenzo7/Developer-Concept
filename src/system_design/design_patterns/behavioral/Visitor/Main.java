package system_design.design_patterns.behavioral.Visitor;

public class Main {
    public static void main(String[] args) {
        RoomElement singleRoom = new SingleRoom();
        RoomElement doubleRoom = new DoubleRoom();
        RoomElement deluxRoom = new DeluxRoom();


        RoomPricingVisitor roomPricingVisitor = new RoomPricingVisitor();
        singleRoom.accept(roomPricingVisitor);
        System.out.println(((SingleRoom) singleRoom).price);

        doubleRoom.accept(roomPricingVisitor);
        System.out.println(((DoubleRoom) doubleRoom).price);

        deluxRoom.accept(roomPricingVisitor);
        System.out.println(((DeluxRoom) deluxRoom).price);


        // Performing other operation on the object
        RoomVisitor roomVisitor = new RoomMaintenanceVisitor();
        singleRoom.accept(roomVisitor);
        doubleRoom.accept(roomVisitor);
        deluxRoom.accept(roomVisitor);
    }
}
