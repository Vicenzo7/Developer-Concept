package system_design.design_patterns.structural.Composite.ProblemStatement;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String directoryName;
    List<Object> objectList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.objectList = new ArrayList<>();
    }

    public void add(Object object) {
        objectList.add(object);
    }

    public void ls() {
        System.out.println("Directory Name: " + directoryName);
        for (Object object : objectList) {

            // this is the problem statement need to put if else and instanceOf
            if (object instanceof File) {
                ((File) object).ls();
            } else if (object instanceof Directory) {
                ((Directory) object).ls();
            }
        }
    }
}
