package multithread;

class WorkerThread implements Runnable {
    private final String message;

    public WorkerThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Message = " + message);
        processMessage(); // Simulate some task
        System.out.println(Thread.currentThread().getName() + " End.");
    }

    private void processMessage() {
        try {
            Thread.sleep(2000); // Simulate task execution time
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
