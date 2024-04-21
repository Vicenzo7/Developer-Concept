package system_design.design_patterns.structural.Composite.Solution1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    private String directoryName;
    List<FileSystem> objectList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.objectList = new ArrayList<>();
    }

    public void add(FileSystem object) {
        objectList.add(object);
    }


    @Override
    public void ls() {
        System.out.println("Directory Name: " + directoryName);
        for (FileSystem fileSystem : objectList) {
            fileSystem.ls();
        }
    }
}
