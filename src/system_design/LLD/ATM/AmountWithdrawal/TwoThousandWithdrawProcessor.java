package system_design.LLD.ATM.AmountWithdrawal;

import system_design.LLD.ATM.ATM;

public class TwoThousandWithdrawProcessor extends CashWithdrawProcessor {

    public TwoThousandWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount) {

        int required = remainingAmount / 2000;
        int balance = remainingAmount % 2000;

        if (required <= atm.getNoOfTwoThousandNotes()) {
            atm.deductTwoThousandNotes(required);
        } else if (required > atm.getNoOfTwoThousandNotes()) {
            balance = balance + (required - atm.getNoOfTwoThousandNotes()) * 2000;
            atm.deductTwoThousandNotes(atm.getNoOfTwoThousandNotes());
        }

        if (balance != 0) {
            nextCashWithdrawalProcessor.withdraw(atm, balance);
        }
    }
}
