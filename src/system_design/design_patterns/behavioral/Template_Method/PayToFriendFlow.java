package system_design.design_patterns.behavioral.Template_Method;

public class PayToFriendFlow extends PaymentFlow{
    @Override
    void validateRequest() {
        // specific validation for PayToFriend flow
        System.out.println("Validate logic of PayToFriendFlow");
    }

    @Override
    void debitAmount() {
        // debit the amount
        System.out.println("Debit Amount logic of PayToFriendFlow");
    }

    @Override
    void calculateFees() {
        System.out.println("0% fee charged");
    }

    @Override
    void creditAmount() {
        // credit the amount
        System.out.println("Credit Amount logic of PayToFriendFlow");
    }
}
