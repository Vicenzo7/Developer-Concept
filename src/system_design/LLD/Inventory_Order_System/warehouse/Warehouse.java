package system_design.LLD.Inventory_Order_System.warehouse;

import system_design.LLD.Inventory_Order_System.user.Address;

import java.util.Map;

//warehouse or store, which generally manages the inventory or act as Inventory controller
public class Warehouse {

    public Inventory inventory;
    public Address address;

    //update inventory
    public void removeItemFromInventory(Map<Integer, Integer> productCategoryAndCountMap) {

        //it will update the items in the inventory based upon product category.
        inventory.removeItems(productCategoryAndCountMap);
    }

    public void addItemToInventory(Map<Integer, Integer> productCategoryAndCountMap) {

        //it will update the items in the inventory based upon product category.
    }
}

