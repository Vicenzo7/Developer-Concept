package system_design.design_patterns.behavioral.State_DP.vending_machine.vendingState.impl;

import system_design.design_patterns.behavioral.State_DP.vending_machine.Coin;
import system_design.design_patterns.behavioral.State_DP.vending_machine.Item;
import system_design.design_patterns.behavioral.State_DP.vending_machine.VendingMachine;
import system_design.design_patterns.behavioral.State_DP.vending_machine.vendingState.State;

import java.util.List;

public class SelectionState implements State {

    public SelectionState() {
        System.out.println("Currently Vending machine in Selection State");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection state");

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in selection state");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode) {
        //Get item if this code number
        Item item = vendingMachine.getInventory().getItem(productCode);

        List<Coin> coins = vendingMachine.getCoins();
        int userPaidAmount = 0;
        for (Coin coin : coins) {
            userPaidAmount += coin.value;
        }

        if (userPaidAmount < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() + " and you paid: " + userPaidAmount);
            refundFullMoney(vendingMachine);
            throw new RuntimeException("insufficient amount");
        } else if (userPaidAmount >= item.getPrice()) {
            if (userPaidAmount > item.getPrice()) {
                getChange(userPaidAmount - item.getPrice());
            }
            vendingMachine.setCurrentState(new DispenseState(vendingMachine, productCode));
        }
    }

    @Override
    public int getChange(int returnChangeMoney) {
        System.out.println("Returned the change in the Coin Dispense Tray: " + returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
        System.out.println("returned the full amount back in the dispense tray");
        List<Coin> coins = vendingMachine.getCoins();
        vendingMachine.setCurrentState(new IdleState(vendingMachine));
        return coins;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("product can not be dispensed Selection state");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int productCode) throws Exception {
        throw new Exception("Inventory can not be updated in Selection state");
    }
}
