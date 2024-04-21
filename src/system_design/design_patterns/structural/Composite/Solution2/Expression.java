package system_design.design_patterns.structural.Composite.Solution2;

public class Expression implements ArithmeticExpression {

    private ArithmeticExpression leftExpression;
    private ArithmeticExpression rightExpression;
    private Operation operation;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int value = switch (operation) {
            case ADD -> leftExpression.evaluate() + rightExpression.evaluate();
            case SUBTRACT -> leftExpression.evaluate() - rightExpression.evaluate();
            case MULTIPLY -> leftExpression.evaluate() * rightExpression.evaluate();
            case DIVIDE -> {
                int rightValue = rightExpression.evaluate();
                if (rightValue == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                yield leftExpression.evaluate() / rightValue;
            }
        };

        System.out.println("Expression value is " + value);
        return value;
    }
}
