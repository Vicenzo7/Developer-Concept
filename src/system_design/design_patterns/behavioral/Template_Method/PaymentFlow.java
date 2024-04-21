package system_design.design_patterns.behavioral.Template_Method;

public abstract class PaymentFlow {

    abstract void validateRequest();
    abstract void debitAmount();
    abstract void calculateFees();
    abstract void creditAmount();

    //this is a Template method: which defines the order of steps to execute the task
    public final void sendMoney() {

        // step1
        validateRequest();

        // step2
        debitAmount();

        // step3
        calculateFees();

        // step4
        creditAmount();
    }

}
