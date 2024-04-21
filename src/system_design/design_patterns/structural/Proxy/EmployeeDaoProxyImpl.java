package system_design.design_patterns.structural.Proxy;

public class EmployeeDaoProxyImpl implements EmployeeDao {

    private EmployeeDao employeeDao;

    public EmployeeDaoProxyImpl() {
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void createEmployee(String clientId, Employee employee) {
        if ("ADMIN".equals(clientId)) {
            employeeDao.createEmployee(clientId, employee);
            return;
        }

        throw new RuntimeException("Access Denied");
    }

    @Override
    public void deleteEmployee(String clientId, int id) {
        if ("ADMIN".equals(clientId)) {
            employeeDao.deleteEmployee(clientId, id);
        }

        throw new RuntimeException("Access Denied");
    }

    @Override
    public Employee getEmployee(String clientId, int id) {
        return employeeDao.getEmployee(clientId, id);
    }
}
