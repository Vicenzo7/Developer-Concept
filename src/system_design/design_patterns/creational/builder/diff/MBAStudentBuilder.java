package system_design.design_patterns.creational.builder.diff;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilderV1{
    @Override
    public StudentBuilderV1 setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Micro Economic");
        subjects.add("Business Development");
        subjects.add("Operations Management");
        this.subjects = subjects;
        return this;
    }

}
