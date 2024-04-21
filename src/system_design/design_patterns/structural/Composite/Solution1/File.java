package system_design.design_patterns.structural.Composite.Solution1;

public class File implements FileSystem{

    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("file name " + fileName);
    }
}
