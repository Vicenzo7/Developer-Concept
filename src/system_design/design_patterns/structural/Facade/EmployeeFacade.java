package system_design.design_patterns.structural.Facade;

public class EmployeeFacade {

    EmployeeDao employeeDao;

    public EmployeeFacade(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void insert(Employee employee) {
        employeeDao.addEmployee(employee);
    }

    public Employee getEmployeeById(int id) {
        return employeeDao.getEmployeeById(id);
    }
}
