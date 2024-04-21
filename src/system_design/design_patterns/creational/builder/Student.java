package system_design.design_patterns.creational.builder;

import java.util.List;

public class Student {
    private int rollNumber;
    private String name;
    private int age;
    private String fatherName;
    private String motherName;
    private List<String> subjects;


    static class StudentBuilder {
        private Student student = new Student();

        public StudentBuilder setRollNumber(int rollNumber) {
            student.rollNumber = rollNumber;
            return this;
        }

        public StudentBuilder setName(String name) {
            student.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            student.age = age;
            return this;
        }


        public StudentBuilder setFatherName(String fatherName) {
            student.fatherName = fatherName;
            return this;
        }

        public StudentBuilder setMotherName(String motherName) {
            student.motherName = motherName;
            return this;
        }

        public StudentBuilder setSubjects(List<String> subjects) {
            student.subjects = subjects;
            return this;
        }

        public Student build() {
            return student;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
