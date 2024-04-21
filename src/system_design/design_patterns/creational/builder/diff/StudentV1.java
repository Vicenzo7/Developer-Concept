package system_design.design_patterns.creational.builder.diff;

import java.util.List;

public class StudentV1 {
    private int rollNumber;
    private String name;
    private int age;
    private String fatherName;
    private String motherName;
    private List<String> subjects;


    public StudentV1(StudentBuilderV1 studentBuilder) {
        this.rollNumber = studentBuilder.rollNumber;
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.subjects = studentBuilder.subjects;
    }


    @Override
    public String toString() {
        return "StudentV1{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
