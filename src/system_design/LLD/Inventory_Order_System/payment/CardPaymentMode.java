package system_design.LLD.Inventory_Order_System.payment;

public class CardPaymentMode implements PaymentMode {

    @Override
    public boolean makePayment() {

        return true;
    }
}
