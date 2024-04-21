package system_design.design_patterns.behavioral.State_DP.vending_machine.vendingState;

import system_design.design_patterns.behavioral.State_DP.vending_machine.Coin;
import system_design.design_patterns.behavioral.State_DP.vending_machine.Item;
import system_design.design_patterns.behavioral.State_DP.vending_machine.VendingMachine;

import java.util.List;

public interface State {
    // this method changes the state
    void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;

    void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception;

    void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;

    void selectProduct(VendingMachine vendingMachine, int productCode) throws Exception;

    int getChange(int returnChangeMoney) throws Exception;

    List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;

    Item dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception;

    void updateInventory(VendingMachine vendingMachine, Item item, int productCode) throws Exception;

}
