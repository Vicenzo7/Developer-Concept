package system_design.design_patterns.creational.singleton;

public class ThreadSafeDbConnection {
    private static ThreadSafeDbConnection threadSafeDbConnection;

    private ThreadSafeDbConnection() {
    }

    synchronized public static ThreadSafeDbConnection getInstance() {
        if (threadSafeDbConnection == null) {
            threadSafeDbConnection = new ThreadSafeDbConnection();
        }
        return threadSafeDbConnection;
    }
}
