package com.example.vicenzo.future;

import com.example.vicenzo.dto.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MoreExamples {


    /*
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


    public static CompletableFuture<Void> sendReminderToEmployeeUsingThenApply() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("fetchEmployee : " + Thread.currentThread().getName());
                return Arrays.asList(new ObjectMapper().readValue(new File("employee.json"), Employee[].class));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).thenApply(employees -> {
            System.out.println("filter new joiner employee : " + Thread.currentThread().getName());
            return employees.stream().filter(e -> "TRUE".equalsIgnoreCase(e.getNewJoiner())).toList();
        }).thenApply(employees -> {
            System.out.println("filter pending training employee : " + Thread.currentThread().getName());
            return employees.stream().filter(e -> "TRUE".equalsIgnoreCase(e.getLearningPending())).toList();
        }).thenApply(employees -> {
            System.out.println("fetch  employee email: " + Thread.currentThread().getName());
            return employees.stream().map(Employee::getEmail).toList();
        }).thenAccept((emails) -> {
            System.out.println("sending email: " + Thread.currentThread().getName());
            emails.forEach(MoreExamples::sendEmail);
        });
    }


    public static CompletableFuture<Void> sendReminderToEmployeeUsingThenApplyAsync() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("fetchEmployee : " + Thread.currentThread().getName());
                return Arrays.asList(new ObjectMapper().readValue(new File("employee.json"), Employee[].class));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).thenApplyAsync(employees -> {
            System.out.println("filter new joiner employee : " + Thread.currentThread().getName());
            return employees.stream().filter(e -> "TRUE".equalsIgnoreCase(e.getNewJoiner())).toList();
        }).thenApplyAsync(employees -> {
            System.out.println("filter pending training employee : " + Thread.currentThread().getName());
            return employees.stream().filter(e -> "TRUE".equalsIgnoreCase(e.getLearningPending())).toList();
        }).thenApplyAsync(employees -> {
            System.out.println("fetch  employee email: " + Thread.currentThread().getName());
            return employees.stream().map(Employee::getEmail).toList();
        }).thenAcceptAsync((emails) -> {
            System.out.println("sending email: " + Thread.currentThread().getName());
            emails.forEach(MoreExamples::sendEmail);
        });
    }

    public static CompletableFuture<Void> sendReminderToEmployeeUsingThenApplyAsyncAndExecutorService() {
        ExecutorService es = Executors.newFixedThreadPool(5);
        try {
            return CompletableFuture.supplyAsync(() -> {
                try {
                    System.out.println("fetchEmployee : " + Thread.currentThread().getName());
                    return Arrays.asList(new ObjectMapper().readValue(new File("employee.json"), Employee[].class));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }, es).thenApplyAsync(employees -> {
                System.out.println("filter new joiner employee : " + Thread.currentThread().getName());
                return employees.stream().filter(e -> "TRUE".equalsIgnoreCase(e.getNewJoiner())).toList();
            }, es).thenApplyAsync(employees -> {
                System.out.println("filter pending training employee : " + Thread.currentThread().getName());
                return employees.stream().filter(e -> "TRUE".equalsIgnoreCase(e.getLearningPending())).toList();
            }, es).thenApplyAsync(employees -> {
                System.out.println("fetch  employee email: " + Thread.currentThread().getName());
                return employees.stream().map(Employee::getEmail).toList();
            }, es).thenAcceptAsync((emails) -> {
                System.out.println("sending email: " + Thread.currentThread().getName());
                emails.forEach(MoreExamples::sendEmail);
            }, es).whenComplete((unused, throwable) -> {
                es.shutdown();
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void sendEmail(String email) {
        System.out.println("sending training reminder email to : " + email);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        sendReminderToEmployeeUsingThenApply().get();
//        sendReminderToEmployeeUsingThenApplyAsync().get();
        sendReminderToEmployeeUsingThenApplyAsyncAndExecutorService().get();
        System.out.println();
    }


}
