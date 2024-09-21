package system_design.design_patterns.behavioral.State_DP.vending_machine;

public class Inventory {
    private ItemShelf[] itemShelves;

    public Inventory(int size) {
        this.itemShelves = new ItemShelf[size];
        //initialEmptyInventory();
    }

    public ItemShelf[] getItemShelves() {
        return itemShelves;
    }


    public void addItem(Item item, int productCode) {
        for (ItemShelf itemShelf : itemShelves) {
            if (itemShelf.getCode() == productCode) {
                if (itemShelf.isSoldOut()) {
                    itemShelf.setItem(item);
                    itemShelf.setSoldOut(false);
                } else {
                    throw new RuntimeException("already item present you cannot add item here.");
                }
            }
        }
    }

    public Item getItem(int productCode) {
        for (ItemShelf itemShelf : itemShelves) {
            if (itemShelf.getCode() == productCode) {
                if (itemShelf.isSoldOut()) {
                    throw new RuntimeException("item already sold out");
                }
                return itemShelf.getItem();
            }
        }
        throw new RuntimeException("Invalid code");
    }

    public void updateSoldOutItem(int productCode) {
        for (ItemShelf itemShelf : itemShelves) {
            if (itemShelf.getCode() == productCode) {
                itemShelf.setSoldOut(true);
            }
        }
    }
}
