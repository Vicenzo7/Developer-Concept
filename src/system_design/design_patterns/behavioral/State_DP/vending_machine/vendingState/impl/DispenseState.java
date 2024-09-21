package system_design.design_patterns.behavioral.State_DP.vending_machine.vendingState.impl;

import system_design.design_patterns.behavioral.State_DP.vending_machine.Coin;
import system_design.design_patterns.behavioral.State_DP.vending_machine.Item;
import system_design.design_patterns.behavioral.State_DP.vending_machine.VendingMachine;
import system_design.design_patterns.behavioral.State_DP.vending_machine.vendingState.State;

import java.util.List;

public class DispenseState implements State {


    public DispenseState(VendingMachine vendingMachine, int productCode) {
        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(vendingMachine, productCode);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("insert coin button can not clicked on Dispense state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("product selection button can not be clicked in Dispense state");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("coin can not be inserted in Dispense state");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("product can not be chosen in Dispense state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("change can not returned in Dispense state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("refund can not be happen in Dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productCode) {
        System.out.println("Product has been dispensed");
        Item item = vendingMachine.getInventory().getItem(productCode);
        vendingMachine.getInventory().updateSoldOutItem(productCode);
        vendingMachine.setCurrentState(new IdleState(vendingMachine));
        return item;
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int productCode) throws Exception {
        throw new Exception("inventory can not be updated in Dispense state");
    }
}
