package multithread;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Message {
    private String message;

    public synchronized void setMessage(String message) {
        while (this.message != null) { // Wait if message is not consumed yet
            try {
                wait(); // Wait for the message to be consumed
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.message = message; // Set the message
        notifyAll(); // Notify waiting threads that the message is available
    }

    public synchronized String getMessage() {
        while (this.message == null) { // Wait if message is not available yet
            try {
                wait(); // Wait for the message to be set
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        String msg = this.message; // Get the message
        this.message = null; // Clear the message
        notifyAll(); // Notify waiting threads that the message has been consumed
        return msg; // Return the message
    }
}
