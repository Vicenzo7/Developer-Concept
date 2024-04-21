package system_design.design_patterns.structural.FlyWeight.word_processor_solution;

public class DocumentCharacter implements ILetter {

    private char character;
    private int size;


    public DocumentCharacter(char character, int size) {
        this.character = character;
        this.size = size;
    }

    @Override
    public void display(int row, int column, String fontType) {
        // display the character at row,column place using
        // particular font and size
    }
}
