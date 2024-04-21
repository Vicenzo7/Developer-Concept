package system_design.design_patterns.structural.Composite.ProblemStatement;

public class File {

    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void ls() {
        System.out.println("file name " + fileName);
    }
}
