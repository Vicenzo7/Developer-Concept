package system_design.design_patterns.behavioral.Mediator;

public class Main {

    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();

        Colleague A = new Bidder("A",auctionMediator);
        Colleague B = new Bidder("B",auctionMediator);
        Colleague C = new Bidder("C",auctionMediator);

        A.placeBid(1000);
        C.placeBid(6000);

    }
}
