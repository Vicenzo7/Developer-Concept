package system_design.design_patterns.structural.FlyWeight.word_processor_solution;

public class Main {
    public static void main(String[] args) {
        LetterFactory letterFactory = new LetterFactory();
        ILetter t = letterFactory.createCharacter('t');
        t.display(0, 0, "Arial");

        ILetter t1 = letterFactory.createCharacter('t');
        t1.display(2, 8, "MonoSpace");

        System.out.println(t.hashCode());
        System.out.println(t1.hashCode());

    }
}
