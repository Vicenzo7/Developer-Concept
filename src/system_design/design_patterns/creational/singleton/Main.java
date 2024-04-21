package system_design.design_patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {

        // Eager
        EagerDBConnection dbConnection = EagerDBConnection.getInstance();
        EagerDBConnection dbConnection1 = EagerDBConnection.getInstance();
        System.out.println(dbConnection.hashCode());
        System.out.println(dbConnection1.hashCode());

        LazyDbConnection lazyInstance1 = LazyDbConnection.getInstance();
        LazyDbConnection lazyInstance2 = LazyDbConnection.getInstance();

        System.out.println(lazyInstance1.hashCode());
        System.out.println(lazyInstance2.hashCode());

    }
}
