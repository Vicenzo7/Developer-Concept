package com.example.vicenzo.future;

import com.example.vicenzo.dto.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class RunAsyncDemo {


    public static void saveEmployee(File employeeJson) throws ExecutionException, InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper();

//        CompletableFuture<Void> runAsyncFuture = CompletableFuture.runAsync(() -> {
//            try {
//                List<Employee> employees = Arrays.asList(objectMapper.readValue(employeeJson, Employee[].class));
//                System.out.println(Thread.currentThread().getName());
//                System.out.println(employees.size);
//
//                // write logic to save list of employees to DB
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        runAsyncFuture.get();



        // using executor service
        ExecutorService es = Executors.newFixedThreadPool(10);
        CompletableFuture<Void> runAsyncFuture = CompletableFuture.runAsync(() -> {
            try {

                List<Employee> employees = Arrays.asList(objectMapper.readValue(employeeJson, Employee[].class));
                System.out.println(Thread.currentThread().getName());
                System.out.println(employees.size());

                // write logic to save list of employees to DB
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }, es);

//        runAsyncFuture.toCompletableFuture();
        runAsyncFuture.get();
        es.shutdown();
    }

    private static void delay(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        saveEmployee(new File("employee.json"));
    }
}
