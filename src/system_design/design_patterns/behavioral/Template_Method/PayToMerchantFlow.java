package system_design.design_patterns.behavioral.Template_Method;

public class PayToMerchantFlow extends PaymentFlow{
    @Override
    void validateRequest() {
        // specific validation for PayToFriend flow
        System.out.println("Validate logic of PayToMerchantFlow");
    }

    @Override
    void debitAmount() {
        // debit the amount
        System.out.println("Debit Amount logic of PayToMerchantFlow");
    }

    @Override
    void calculateFees() {
        System.out.println("2% fee charged");
    }

    @Override
    void creditAmount() {
        // credit the amount
        System.out.println("Credit Amount logic of PayToMerchantFlow");
    }
}
