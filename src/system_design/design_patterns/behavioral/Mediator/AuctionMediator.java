package system_design.design_patterns.behavioral.Mediator;

public interface AuctionMediator {

    void addBidder(Colleague bidder);

    void placeBid(Colleague bidder, int bidAmount);

}
