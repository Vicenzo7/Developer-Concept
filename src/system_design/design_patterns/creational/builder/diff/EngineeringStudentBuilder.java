package system_design.design_patterns.creational.builder.diff;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilderV1 {
    @Override
    public StudentBuilderV1 setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Computer Science");
        subjects.add("DSA");
        subjects.add("OS");
        this.subjects = subjects;
        return this;
    }
}
