package system_design.design_patterns.structural.Proxy;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();

        try {
            EmployeeDaoProxyImpl employeeDaoProxy = new EmployeeDaoProxyImpl();
            employeeDaoProxy.createEmployee("ADMIN", new Employee());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
