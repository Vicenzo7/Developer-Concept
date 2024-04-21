package multithread;

public class MultiThreadThing extends Thread {

    private final int threadNumber;

    public MultiThreadThing(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber);


            // creating exception for thread Number 3
            // to check other thread keep working
//            if (threadNumber == 3) {
//                throw new RuntimeException();
//            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
