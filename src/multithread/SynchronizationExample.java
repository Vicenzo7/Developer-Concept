package multithread;

public class SynchronizationExample {

    public static void main(String[] args) {
        Counter counter = new Counter();

        // Thread 1: Increment the counter 1000 times
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Thread 2: Increment the counter 1000 times
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final output " + counter.getCount());
    }


//     static class Counter {
//        public int counter = 0;
//
////        public int getCounter() {
////            return counter;
////        }
////
////        public void increment() {
////            this.counter++;
////        }
//
//        // with synchronization
//
//        public synchronized int getCount() {
//            return counter;
//        }
//
//        public synchronized void increment() {
//            this.counter++;
//        }
//    }

    static class Counter {
        private int count = 0;


        /*
            In the increment() and getCount() methods, synchronized(this) indicates that the code within
            the curly braces will be executed in a synchronized manner,meaning only one thread can
            execute this block at a time on the current instance of the Counter object.
        */


        public void increment() {
            synchronized (this) {
                count++;
            }
        }

        public int getCount() {
            synchronized (this) {
                return count;
            }
        }
    }
}
