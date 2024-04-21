package system_design.LLD.Splitwise.expense;

import system_design.LLD.Splitwise.expense.split.EqualExpenseSplit;
import system_design.LLD.Splitwise.expense.split.ExpenseSplit;
import system_design.LLD.Splitwise.expense.split.PercentageExpenseSplit;
import system_design.LLD.Splitwise.expense.split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}
