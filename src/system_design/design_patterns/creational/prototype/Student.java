package system_design.design_patterns.creational.prototype;

public class Student implements Cloneable{

    /*
        Prototype Design Pattern : Create a copy of those object which are very expensive to make
    **/
    private String name;
    private int age;
    private String gender;
    private Department department;

    public Student(String name, int age, String gender, Department department) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department=" + department +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department();
        department.setName("Engineering");
        Student student1 = new Student("John", 20, "Male", department);


        Student student2 = (Student) student1.clone();
        student2.department.setName("IT");
        System.out.println(student1);
        System.out.println(student2);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department cloneDepartment = new Department();
        cloneDepartment.setName(department.getName());
        return new Student(name, age, gender, cloneDepartment);
    }
}
