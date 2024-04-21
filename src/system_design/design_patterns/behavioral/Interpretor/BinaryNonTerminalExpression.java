package system_design.design_patterns.behavioral.Interpretor;

public class BinaryNonTerminalExpression implements AbstractExpression{
    AbstractExpression leftNonTerminalExpression;
    AbstractExpression rightNonTerminalExpression;
    String operator;

    public BinaryNonTerminalExpression(AbstractExpression leftNonTerminalExpression,
                                       AbstractExpression rightNonTerminalExpression, String operator) {
        this.leftNonTerminalExpression = leftNonTerminalExpression;
        this.rightNonTerminalExpression = rightNonTerminalExpression;
        this.operator = operator;
    }


    @Override
    public int interpret(Context context) {
        return switch (operator) {
            case "*" -> leftNonTerminalExpression.interpret(context) * rightNonTerminalExpression.interpret(context);
            case "+" -> leftNonTerminalExpression.interpret(context) + rightNonTerminalExpression.interpret(context);
            default -> 0;
        };
    }
}
