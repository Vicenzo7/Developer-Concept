package system_design.design_patterns.creational.builder;

import java.util.ArrayList;

public class MainClass {

    /*
        Builder Design Pattern :- Create object step by step
    */

    public static void main(String[] args) {
        Student student = new Student.StudentBuilder()
                .setRollNumber(1)
                .setName("Test name")
                .setFatherName("test")
                .setMotherName("test")
                .setAge(12)
                .setSubjects(new ArrayList<>())
                .build();

        Student student1 = new Student.StudentBuilder()
                .setRollNumber(1)
                .setName("Test name")
                .setFatherName("test")
                .setMotherName("test")
                .setAge(12)
                .setSubjects(new ArrayList<>())
                .build();

        System.out.println(student);
    }
}
