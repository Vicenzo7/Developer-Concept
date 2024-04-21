package system_design.design_patterns.structural.Proxy;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void createEmployee(String clientId, Employee employee) {
        System.out.println("created an Employee");
    }

    @Override
    public void deleteEmployee(String clientId, int id) {
        System.out.println("deleted an employee with id " + id);
    }

    @Override
    public Employee getEmployee(String clientId, int id) {
        return new Employee();
    }
}
