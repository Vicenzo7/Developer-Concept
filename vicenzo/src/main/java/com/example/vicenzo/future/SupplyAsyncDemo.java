package com.example.vicenzo.future;

import com.example.vicenzo.dto.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SupplyAsyncDemo {

    public static List<Employee> asyncCallToDB() {
//        CompletableFuture<List<Employee>> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println(Thread.currentThread().getName());
//            return fetchEmployeeFromDB();
//        });


        // using executor service
        ExecutorService es = Executors.newFixedThreadPool(10);
        CompletableFuture<List<Employee>> future = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            return fetchEmployeeFromDB();
        }, es);

        try {
            es.shutdown();
            return future.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }


    public static List<Employee> fetchEmployeeFromDB() {
        try {
            return Arrays.asList(new ObjectMapper().readValue(new File("employee.json"), Employee[].class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        List<Employee> employees = asyncCallToDB();
        System.out.println(employees.size());
    }
}
