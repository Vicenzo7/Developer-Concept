package system_design.LLD.Inventory_Order_System.payment;

public class UPIPaymentMode implements PaymentMode {

    @Override
    public boolean makePayment() {
        return true;
    }
}
