package com.example.vicenzo.future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Supplier;

public class CompletableFutureExample {



    /*
        What is Completable Future
        A new era of asynchronous programming

        Using Asynchronous Programming you can write non-blocking code
        where concurrently you can run N number of task in separate threads
        without blocking main thread

        When the task is complete it notifies the main thread whether the task was completed
        or failed.


        Why Completable Future?
        -> There are different ways to implement asynchronous programming using the below
        1.Futures
        2.ExecutorService
        3.Callback Interface

        But they have disadvantages
        1. Cannot be manually completed,
            -> do not have option to forcefully complete the future.
        2. Multiple futures cannot be chained together
            -> Cannot pass response of one future to another thread for execution
        3. We cannot combine multiple Futures together
        4. No Proper Exception handling mechanism

        Let's prove this disadvantages with code

    */


    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        disadvantages();

        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        completableFuture.get();
        completableFuture.complete("Default value");
        System.out.println(completableFuture.get());


        /*
            runAsync() vs supplyAsync()

            runAsync()
            If we do not except any return value from the asynchronous call use runAsync
            It takes a runnable object and return a CompletableFuture<Void>
            CompletableFuture.runAsync(Runnable) -> gets it thread from ForkJoinPool.commonPool()
            CompletableFuture.runAsync(Runnable,Executor)


            supplyAsync()
            If we except any return value from the asynchronous call use supplyAsync
            It takes a Supplier<T> object and return a CompletableFuture<Void>
            CompletableFuture.supplyAsync(Supplier<T>) -> gets thread from ForkJoinPool.commonPool()
            CompletableFuture.supplyAsync(Supplier<T>,Executor)

            After getting your result you can apply the below methods

            1.thenApply(Function)
            -> Takes input from us or gets the input does data manipulation and return
            2.thenAccept(Consumer)
            -> Takes input as consumer but does not return anything
            3.thenRun(Runnable)
            Takes input as Runnable but does not return anything

            The above three methods we will see demo for the below use case
            Use-Case: Employee training reminder
            1. Get all employee from the DB
            2. Filter out all joined employees
            3. Check if training activity is pending for employee
            4. Get employees email id
            5. Send remainder notification to employee

            The above operation we will run in different thread by joining ones result

        */

    }

    private static void disadvantages() throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(5);
        Future<List<Integer>> future1 = es.submit(() -> {
            // let's assume we are doing api call, that takes 30 seconds
            System.out.println("Thread " + Thread.currentThread().getName());
//            delay(10);
            // throw exception to prove last point
            System.out.println(10 / 0);

            return Arrays.asList(1, 2, 3, 4, 5, 6);
        });

        Future<List<Integer>> future2 = es.submit(() -> {
            // let's assume we are doing api call, that takes 30 seconds
            System.out.println("Thread " + Thread.currentThread().getName());
            delay(10);
            return Arrays.asList(1, 2, 3, 4, 5, 6);
        });


        List<Integer> list1 = future1.get();
//        List<Integer> list2 = future2.get();

        System.out.println(list1);
//        System.out.println(list2);
        /*
            Disadvantages
            1. There is no way to manually complete the future using the future object -> 1st disadvantage
            2. There is no way to pass this future response to another thread -> second disadvantage
            3. Also, there is no method to join or combine future1 and future2 -> third disadvantage
            like future1 + future2 or future1.future2
            4. No proper exception handling mechanism
        */

        es.shutdown();
    }


    private static void delay(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
