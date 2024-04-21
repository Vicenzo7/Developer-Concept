package system_design.design_patterns.creational.builder.diff;

import java.util.List;

public abstract class StudentBuilderV1 {
    int rollNumber;
    String name;
    int age;
    String fatherName;
    String motherName;
    List<String> subjects;

    public StudentBuilderV1 setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilderV1 setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilderV1 setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilderV1 setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilderV1 setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    abstract public StudentBuilderV1 setSubjects();

    public StudentV1 build() {
        return new StudentV1(this);
    }

}
