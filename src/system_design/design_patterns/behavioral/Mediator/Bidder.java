package system_design.design_patterns.behavioral.Mediator;

public class Bidder implements Colleague {

    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        this.auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveBidNotification(String bidderName, int bidAmount) {
        System.out.println("Bidder : " + this.name + " received Notification");
        System.out.println(bidderName + " has placed " + bidAmount + " bids");
        System.out.println();
    }

    @Override
    public String getName() {
        return name;
    }
}
