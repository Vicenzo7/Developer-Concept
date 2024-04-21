package system_design.design_patterns.behavioral.State_DP.vending_machine;

import system_design.design_patterns.behavioral.State_DP.vending_machine.vendingState.State;
import system_design.design_patterns.behavioral.State_DP.vending_machine.vendingState.impl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private State currentState;
    private List<Coin> coins;
    private Inventory inventory;

    public VendingMachine() {
        this.currentState = new IdleState();
        this.coins = new ArrayList<>();
        this.inventory = new Inventory(12);
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
