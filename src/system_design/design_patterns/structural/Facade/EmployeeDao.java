package system_design.design_patterns.structural.Facade;

public class EmployeeDao {

    public void addEmployee(Employee employee) {

    }


    public void updateEmployee(Employee employee) {

    }


    public Employee getEmployeeById(int id) {
        return new Employee();
    }


    public Employee getEmployeeByEmail(String email) {
        return new Employee();
    }
}
