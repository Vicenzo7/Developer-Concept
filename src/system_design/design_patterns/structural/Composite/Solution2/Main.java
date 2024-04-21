package system_design.design_patterns.structural.Composite.Solution2;

public class Main {
    public static void main(String[] args) {
        try {
            ArithmeticExpression two = new Number(2);
            ArithmeticExpression one = new Number(1);
            ArithmeticExpression seven = new Number(7);

            Expression addExpression = new Expression(one, seven, Operation.ADD);

            Expression expression = new Expression(two, addExpression, Operation.MULTIPLY);

            System.out.println(expression.evaluate());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
