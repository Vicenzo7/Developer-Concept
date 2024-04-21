package multithread;

public class Multithreading {
    public static void main(String[] args) {

        /*
            Multithreading by extending Thread class
        */

//        for (int i = 1; i <= 3; i++) {
//            MultiThreadThing myThing = new MultiThreadThing(i);
//            myThing.start();
//        }

        // creating exception on main thread to check other threads keep working
//        throw new RuntimeException();



        /*
            Multithreading by implementing Runnable interface

            This method is a better approach since java does not allow multiple
            inheritance
        */

        for (int i = 10; i <= 12; i++) {
            MultiThreadThing2 myThing = new MultiThreadThing2(i);
            Thread thread = new Thread(myThing);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
