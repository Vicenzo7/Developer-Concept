package system_design.design_patterns.behavioral.State_DP.vending_machine.vendingState.impl;

import system_design.design_patterns.behavioral.State_DP.vending_machine.Coin;
import system_design.design_patterns.behavioral.State_DP.vending_machine.Item;
import system_design.design_patterns.behavioral.State_DP.vending_machine.VendingMachine;
import system_design.design_patterns.behavioral.State_DP.vending_machine.vendingState.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Currently Vending Machine in Idle State");
    }

    public IdleState(VendingMachine vendingMachine) {
        System.out.println("Currently Vending Machine in Idle State");
        vendingMachine.setCoins(new ArrayList<>());
    }


    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        vendingMachine.setCurrentState(new HashMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new RuntimeException("first you need to click on insert coin button");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new RuntimeException("you cannot insert money in idle state");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode) {
        throw new RuntimeException("you cannot choose product in idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) {
        throw new RuntimeException("you cannot get change in idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
        throw new RuntimeException("you cannot refund full money in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productCode) {
        throw new RuntimeException("product cannot be dispensed in idle state");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int productCode) {
        vendingMachine.getInventory().addItem(item, productCode);
    }
}
