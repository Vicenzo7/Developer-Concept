package system_design.LLD.Inventory_Order_System.payment;

public class Payment {

   public PaymentMode paymentMode;

   public Payment(PaymentMode paymentMode){
       this.paymentMode = paymentMode;
   }

    public boolean makePayment(){
        return paymentMode.makePayment();
    }

}

