package system_design.design_patterns.creational.singleton;

public class EagerDBConnection {


    /*
        Singleton Design Pattern : Allow to create only a single instance of an Object

        4 ways to achieve this

        1. Eager
        2. Lazy
        3. Synchronized
        4. Double Locking
    */

    private static final EagerDBConnection dbConnection = new EagerDBConnection();

    private EagerDBConnection() {
    }

    public static EagerDBConnection getInstance() {
        return dbConnection;
    }
}
