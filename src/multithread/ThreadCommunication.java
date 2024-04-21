package multithread;

public class ThreadCommunication {
    public static void main(String[] args) {
        Message message = new Message();

        // Create producer and consumer threads
        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                String msg = "Message " + i;
                message.setMessage(msg);
                System.out.println("Produced: " + msg);
                try {
                    Thread.sleep(1000); // Simulate producing time
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                String receivedMessage = message.getMessage();
                System.out.println("Consumed: " + receivedMessage);
                try {
                    Thread.sleep(2000); // Simulate consuming time
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Start producer and consumer threads
        producerThread.start();
        consumerThread.start();
    }
}
