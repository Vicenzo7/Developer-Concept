package clone;

public class Employee implements Cloneable {

    private String name;
    private Company company;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Company company1 = new Company();
        company1.setName("company1");
        Employee e1 = new Employee();
        e1.setCompany(company1);
        e1.setName("test e1");
        System.out.println(e1.getCompany().getName());

        Employee e2 = (Employee) e1.clone();
        System.out.println(e2.getCompany().getName());

        e2.getCompany().setName("new company");
        System.out.println(e1.getCompany().getName());
        System.out.println(e2.getCompany().getName());


    }

    @Override
    public Employee clone() {
        try {
            Employee clone = (Employee) super.clone();
            clone.setCompany(company.clone());
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
