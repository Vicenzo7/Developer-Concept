package system_design.design_patterns.structural.Proxy;

public interface EmployeeDao {
    void createEmployee(String clientId, Employee employee);

    void deleteEmployee(String clientId, int id);

    Employee getEmployee(String clientId, int id);
}
