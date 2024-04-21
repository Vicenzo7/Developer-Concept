package system_design.design_patterns.behavioral.State_DP.vending_machine;

import system_design.design_patterns.behavioral.State_DP.vending_machine.vendingState.State;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        try {
            System.out.println("|");
            System.out.println("filling up the inventory");
            System.out.println("|");

            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("|");
            System.out.println("Clicking on insert coin button");
            System.out.println("|");

            State currentState = vendingMachine.getCurrentState();
            currentState.clickOnInsertCoinButton(vendingMachine);


            currentState = vendingMachine.getCurrentState();
            currentState.insertCoin(vendingMachine, Coin.NICKEL);
            currentState.insertCoin(vendingMachine, Coin.QUARTER);

            System.out.println("|");
            System.out.println("clicking on product selection button");
            System.out.println("|");

            //currentState = vendingMachine.getCurrentState();
            currentState.clickOnStartProductSelectionButton(vendingMachine);

            currentState = vendingMachine.getCurrentState();
            currentState.selectProduct(vendingMachine, 2);

            displayInventory(vendingMachine);

        } catch (Exception e) {
            displayInventory(vendingMachine);
        }

    }

    private static void fillUpInventory(VendingMachine vendingMachine) {
        ItemShelf[] itemShelves = vendingMachine.getInventory().getItemShelves();
        for (int i = 0; i < itemShelves.length; i++) {
            itemShelves[i] = new ItemShelf();
            Item item = new Item();
            if (i < 3) {
                item.setItemType(ItemType.COKE);
                item.setPrice(10);
            } else if (i < 6) {
                item.setItemType(ItemType.PEPSI);
                item.setPrice(10);
            } else if (i < 9) {
                item.setItemType(ItemType.JUICE);
                item.setPrice(15);
            } else {
                item.setItemType(ItemType.SODA);
                item.setPrice(20);
            }
            itemShelves[i].setItem(item);
            itemShelves[i].setSoldOut(false);
            itemShelves[i].setCode(i + 1);
        }
    }

    private static void displayInventory(VendingMachine vendingMachine) {

        ItemShelf[] slots = vendingMachine.getInventory().getItemShelves();
        for (ItemShelf slot : slots) {
            System.out.println("CodeNumber: " + slot.getCode() +
                    " Item: " + slot.getItem().getItemType().name() +
                    " Price: " + slot.getItem().getPrice() +
                    " isAvailable: " + !slot.isSoldOut());
        }
    }
}
