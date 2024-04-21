package system_design.design_patterns.behavioral.Mediator;

public interface Colleague {

    void placeBid(int bidAmount);

    void receiveBidNotification(String name, int bidAmount);

    String getName();
}
