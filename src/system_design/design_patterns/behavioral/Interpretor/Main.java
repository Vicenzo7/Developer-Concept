package system_design.design_patterns.behavioral.Interpretor;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 2);
        context.put("b", 3);
        context.put("c", 4);
        context.put("d", 5);

        // a * b
        AbstractExpression abstractExpression = new BinaryNonTerminalExpression(
                new TerminalExpression("a"), new TerminalExpression("b"), "*"
        );

        System.out.println(abstractExpression.interpret(context));

        // (a*b) + (c*d)
        AbstractExpression abstractExpression1 = new BinaryNonTerminalExpression(
                new BinaryNonTerminalExpression(new TerminalExpression("a"), new TerminalExpression("b"), "*"),
                new BinaryNonTerminalExpression(new TerminalExpression("c"), new TerminalExpression("d"), "*"),
                "+"
        );
        System.out.println(abstractExpression1.interpret(context));
    }
}
