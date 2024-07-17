package com.example.vicenzo.future;

import java.security.InvalidParameterException;
import java.util.concurrent.*;

public class CallableExample {


    public static void main(String[] args) {
        Task task = new Task(5);

        ExecutorService es = Executors.newFixedThreadPool(5);
        Future<Integer> future = es.submit(task);

        try {
            System.out.println("Result is :" + future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        es.shutdown();
    }

    static class Task implements Callable<Integer> {
        private int num;

        public Task(int num) {
            this.num = num;
        }

        @Override
        public Integer call() throws Exception {
            if (num < 0) {
                throw new InvalidParameterException("Negative number not allowed");
            }
            return num * num;
        }
    }
}
