package system_design.design_patterns.structural.FlyWeight.word_processor_problem;

public class Character {
    private char character;
    private String fontType;
    private int size;
    private int row;
    private int column;

    public Character(char character, String fontType, int size, int row, int column) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
        this.row = row;
        this.column = column;
    }
}
