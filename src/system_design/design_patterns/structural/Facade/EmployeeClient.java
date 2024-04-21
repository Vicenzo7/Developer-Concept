package system_design.design_patterns.structural.Facade;

public class EmployeeClient {
    public static void main(String[] args) {
        EmployeeFacade employeeFacade = new EmployeeFacade(new EmployeeDao());
        Employee employeeById = employeeFacade.getEmployeeById(1);
    }
}
