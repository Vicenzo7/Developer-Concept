package system_design.design_patterns.structural.FlyWeight.word_processor_problem;

public class Main {
    public static void main(String[] args) {
        /*
            this is the data we want to write to word processor;

            Total Characters = 58
            Repeated characters
            t = 7 times
            h = 3 times
            a = 3 times and so on...
        */

        Character character1 = new Character('t', "Arial", 4, 0, 0);
        Character character2 = new Character('h', "Arial", 4, 0, 1);
        Character character3 = new Character('i', "Arial", 4, 0, 2);
        Character character4 = new Character('s', "Arial", 4, 0, 3);
    }
}
