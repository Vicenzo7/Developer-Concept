package system_design.design_patterns.creational.builder.diff;

public class Director {

    public static void main(String[] args) {
        StudentV1 engineer = new EngineeringStudentBuilder()
                .setRollNumber(1)
                .setName("Engineer 1")
                .setAge(12)
                .setFatherName("Dad 1")
                .setMotherName("Mom 1")
                .setSubjects()
                .build();

        System.out.println(engineer);

        StudentV1 mba = new MBAStudentBuilder()
                .setRollNumber(1)
                .setName("MBA 1")
                .setAge(12)
                .setFatherName("Dad 1")
                .setMotherName("Mom 1")
                .setSubjects()
                .build();

        System.out.println(mba);
    }
}
