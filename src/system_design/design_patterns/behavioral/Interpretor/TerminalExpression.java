package system_design.design_patterns.behavioral.Interpretor;

public class TerminalExpression implements AbstractExpression {

    String expression;

    public TerminalExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(Context context) {
        return context.get(expression);
    }
}
