package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Example of Thread Pool Executor Service

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        for (int i = 0; i < 10; i++) {
            WorkerThread worker = new WorkerThread("Task " + i);
            executor.execute(worker);
        }

        executor.shutdown(); // Shutdown the executor
    }
}
