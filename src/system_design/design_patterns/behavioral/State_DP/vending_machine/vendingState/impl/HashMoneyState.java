package system_design.design_patterns.behavioral.State_DP.vending_machine.vendingState.impl;

import system_design.design_patterns.behavioral.State_DP.vending_machine.Coin;
import system_design.design_patterns.behavioral.State_DP.vending_machine.Item;
import system_design.design_patterns.behavioral.State_DP.vending_machine.VendingMachine;
import system_design.design_patterns.behavioral.State_DP.vending_machine.vendingState.State;

import java.util.List;

public class HashMoneyState implements State {

    public HashMoneyState() {
        System.out.println("Currently Vending machine in HasMoneyState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        return;
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setCurrentState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        System.out.println("Accepted the coin");
        vendingMachine.getCoins().add(coin);
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode) {
        throw new RuntimeException("you need to click on start product selection button first");
    }

    @Override
    public int getChange(int returnChangeMoney) {
        throw new RuntimeException("you cannot get change in hasMoneyState");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
        System.out.println("returned the full amount back in the dispense tray");
        List<Coin> coins = vendingMachine.getCoins();
        vendingMachine.setCurrentState(new IdleState(vendingMachine));
        return coins;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productCode) {
        throw new RuntimeException("you cannot dispense product in hashMoneyState");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int productCode) {
        throw new RuntimeException("you cannot update inventory in hashMoneyState");
    }
}
