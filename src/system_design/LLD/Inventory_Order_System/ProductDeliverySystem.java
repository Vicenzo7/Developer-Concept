package system_design.LLD.Inventory_Order_System;

import system_design.LLD.Inventory_Order_System.user.Cart;
import system_design.LLD.Inventory_Order_System.user.User;
import system_design.LLD.Inventory_Order_System.user.UserController;
import system_design.LLD.Inventory_Order_System.order.Order;
import system_design.LLD.Inventory_Order_System.order.OrderController;
import system_design.LLD.Inventory_Order_System.warehouse.*;

import java.util.List;

public class ProductDeliverySystem {

    UserController userController;
    WarehouseController warehouseController;
    OrderController orderController;

    public ProductDeliverySystem(List<User> userList, List<Warehouse> warehouseList) {
        userController = new UserController(userList);
        warehouseController = new WarehouseController(warehouseList, null);
        orderController = new OrderController();
    }

    //get user object
    public User getUser(int userId) {
        return userController.getUser(userId);
    }

    //get warehouse
    public Warehouse getWarehouse(WarehouseSelectionStrategy warehouseSelectionStrategy) {
        return warehouseController.selectWarehouse(warehouseSelectionStrategy);

    }

    //get inventory
    public Inventory getInventory(Warehouse warehouse) {
        return warehouse.inventory;

    }

    //add product to cart
    public void addProductToCart(User user, ProductCategory product, int count) {
        Cart cart = user.getUserCart();
        cart.addItemInCart(product.productCategoryId, count);
    }

    //place order
    public Order placeOrder(User user, Warehouse warehouse) {
        return orderController.createNewOrder(user, warehouse);
    }

    public void checkout(Order order) {
        order.checkout();
    }

}

