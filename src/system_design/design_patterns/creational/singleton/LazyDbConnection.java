package system_design.design_patterns.creational.singleton;

public class LazyDbConnection {
    private static LazyDbConnection lazyDbConnection;


    private LazyDbConnection() {}

    public static LazyDbConnection getInstance() {
        if (lazyDbConnection == null) {
            lazyDbConnection = new LazyDbConnection();
        }
        return lazyDbConnection;
    }
}
