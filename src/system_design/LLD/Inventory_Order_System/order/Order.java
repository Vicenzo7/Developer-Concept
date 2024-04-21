package system_design.LLD.Inventory_Order_System.order;

import system_design.LLD.Inventory_Order_System.payment.Payment;
import system_design.LLD.Inventory_Order_System.payment.PaymentMode;
import system_design.LLD.Inventory_Order_System.payment.UPIPaymentMode;
import system_design.LLD.Inventory_Order_System.user.Address;
import system_design.LLD.Inventory_Order_System.user.User;
import system_design.LLD.Inventory_Order_System.warehouse.Warehouse;

import java.util.Map;

public class Order {

    public User user;
    public Address deliveryAddress;
    public Map<Integer, Integer> productCategoryAndCountMap;
    public Warehouse warehouse;
    public Invoice invoice;
    public Payment payment;
    public OrderStatus orderStatus;

    Order(User user, Warehouse warehouse) {
        this.user = user;
        this.productCategoryAndCountMap = user.getUserCart().getCartItems();
        this.warehouse = warehouse;
        this.deliveryAddress = user.address;
        invoice = new Invoice();
        invoice.generateInvoice(this);
    }

    public void checkout() {

        //1. update inventory
        warehouse.removeItemFromInventory(productCategoryAndCountMap);

        //2. make Payment
        boolean isPaymentSuccess = makePayment(new UPIPaymentMode());

        //3. make cart empty
        if (isPaymentSuccess) {
            user.getUserCart().emptyCart();
        } else {
            warehouse.addItemToInventory(productCategoryAndCountMap);
        }

    }

    public boolean makePayment(PaymentMode paymentMode) {
        payment = new Payment(paymentMode);
        return payment.makePayment();
    }

    public void generateOrderInvoice() {
        invoice.generateInvoice(this);
    }
}
