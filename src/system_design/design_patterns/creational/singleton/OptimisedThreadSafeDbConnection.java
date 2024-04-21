package system_design.design_patterns.creational.singleton;

public class OptimisedThreadSafeDbConnection {

    /*
        Also called as Double Locking
    */


    private static OptimisedThreadSafeDbConnection threadSafeDbConnection;

    private OptimisedThreadSafeDbConnection() {}

    public OptimisedThreadSafeDbConnection getInstance() {
        if (threadSafeDbConnection == null) {
            synchronized (this) {
                if (threadSafeDbConnection == null) {
                    threadSafeDbConnection = new OptimisedThreadSafeDbConnection();
                }
            }
        }

        return threadSafeDbConnection;
    }
}
