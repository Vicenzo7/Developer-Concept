package lambda_and_streams;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdasAndStreams {
    public static void main(String[] args) {

        separateOddEvenNumbers();
        removeDuplicateElements();
        characterFrequencyMap();
        wordFrequencyMap();
        sortInAscendingAndDescendingOrder();
        joinList();
        getMultipleOf5();
        minMax();
        mergeTwoUnSortedArray();
        mergeTwoUnSortedArrayWithoutDuplicate();
        threeMinimumAndMaximum();
        isAnagram();
        sumOfDigits();
        findSecondLargest();
        sortListOfStringLengthWise();
        sumAndAverage();
        commonElements();
        reverseEachWordInString();
        sumOfFirstNNumbers();
        reverseIntegerArray();
        printFirst10EvenNumbers();
        mostRepeatedElementInArray();
        isPalindrome();
        wordsStartingWithNumber();
        fetchDuplicateElements();
        printDuplicateCharactersInString();
        firstRepeatedCharacterInString();
        firstNonRepeatedCharacterInString();
        fibonacciSeries();
        printFirst10OddNumbers();
        lastElementInArray();
        findAge();


    }

    private static void joinList() {
        // Given a list of strings, join the strings with '[' as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joinedList = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(joinedList);
    }

    private static void sortInAscendingAndDescendingOrder() {
        //        How do you sort the given list of decimals in reverse order?

        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        List<Double> sortedList = decimalList.stream().sorted().collect(Collectors.toList());

        System.out.println("Sorted List");
        System.out.println(sortedList);

        List<Double> reverseSortedList = decimalList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Reverse Sorted List");
        System.out.println(reverseSortedList);
    }

    private static void wordFrequencyMap() {
        //        How do you find frequency of each element in an array or a list?
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book",
                "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> wordFrequencyMap = stationeryList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(wordFrequencyMap);
    }

    private static void characterFrequencyMap() {
        //How do you find frequency of each character in a string using Java 8 streams?
        String inputString = "Java Concept Of The Day";

        Map<Character, Long> frequencyMap = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequencyMap);
    }

    private static void removeDuplicateElements() {
        // How do you remove duplicate elements from a list using Java 8 streams?

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

//        Set<String> uniqueElements = listOfStrings.stream().collect(Collectors.toSet());

        List<String> uniqueElements = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueElements);
    }

    private static void separateOddEvenNumbers() {
        // Given a list of integers, separate odd and even numbers?

        List<Integer> numbers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> evenOddMap =
                numbers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

        for (Map.Entry<Boolean, List<Integer>> entry : evenOddMap.entrySet()) {
            Boolean key = entry.getKey();
            List<Integer> value = entry.getValue();
            if (key) {
                System.out.println("Even Numbers");
                System.out.println(value);
            } else {
                System.out.println("Odd Numbers");
                System.out.println(value);
            }
        }
    }

    private static void findAge() {
        // Find the age of a person in years if the birthday has given?
        LocalDate birthDay = LocalDate.of(1999, 12, 20);
        LocalDate today = LocalDate.now();
        long year = ChronoUnit.YEARS.between(birthDay, today);
        System.out.println(year);
    }

    private static void lastElementInArray() {
        // How do you get last element of an array?
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        String s = listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get();
        System.out.println(s);
    }

    private static void printFirst10OddNumbers() {
        // First 10 odd numbers
        List<Integer> list = Stream.iterate(new int[]{1, 3}, f -> new int[]{f[1], f[1] + 2})
                .limit(10)
                .map(f -> f[0])
                .toList();

        System.out.println(list);
    }

    private static void fibonacciSeries() {
        // Fibonacci series

        List<Integer> fibonacciSeries = Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(10)
                .map(f -> f[0])
                .toList();

        System.out.println(fibonacciSeries);
    }

    private static void firstNonRepeatedCharacterInString() {
        //  Find first non-repeated character in a string?
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        LinkedHashMap<String, Long> frequencyMap = Arrays.stream(inputString.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String s = frequencyMap.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(s);
    }

    private static void firstRepeatedCharacterInString() {
        // Find first repeated character in a string?
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        LinkedHashMap<String, Long> frequencyMap = Arrays.stream(inputString.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));


        String s = frequencyMap.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(s);
    }

    private static void printDuplicateCharactersInString() {
        //  Print duplicate characters in a string?
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        Set<Character> uniqueElements = new HashSet<>();
        Set<String> uniqueChars = new HashSet<>();

        Set<Character> collect = inputString.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !uniqueElements.add(c))
                .collect(Collectors.toSet());
        System.out.println(collect);

        Set<String> duplicateChars =
                Arrays.stream(inputString.split(""))
                        .filter(ch -> !uniqueChars.add(ch))
                        .collect(Collectors.toSet());

        System.out.println(duplicateChars);
    }

    private static void fetchDuplicateElements() {
        // How do you extract duplicate elements from an array?
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = listOfIntegers.stream()
                .filter(num -> !uniqueElements.add(num)).collect(Collectors.toSet());

        System.out.println(duplicateElements);
    }

    private static void wordsStartingWithNumber() {
        // Given a list of strings, find out those strings which start with a number?
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        List<String> list = listOfStrings.stream().filter(s -> Character.isDigit(s.charAt(0))).toList();

        System.out.println(list);
    }

    private static void isPalindrome() {
        // Palindrome program using Java 8 streams
        String str = "ROTATOR";

        boolean isPalindrome = IntStream.range(0, str.length()).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
        if (isPalindrome) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    private static void mostRepeatedElementInArray() {
        //  How do you find the most repeated element in an array?
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen",
                "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> frequencyMap = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap);
        Map.Entry<String, Long> result = frequencyMap.entrySet().stream()
                .max(Map.Entry.comparingByValue()).get();

        System.out.println(result.getKey());
    }

    private static void printFirst10EvenNumbers() {
        //Print first 10 even numbers

        IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);
    }

    private static void reverseIntegerArray() {
        // Reverse an integer array
        int[] array = new int[]{5, 1, 7, 3, 9, 6};
        int[] result = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();
        System.out.println(Arrays.toString(result));
    }

    private static void sumOfFirstNNumbers() {
        // How do you find sum of first 10 natural numbers?
        int sum = IntStream.range(1, 11).sum();
        System.out.println(sum);
    }

    private static void reverseEachWordInString() {
        // Reverse each word of a string using Java 8 streams?

        String str = "Java Concept Of The Day";
        String result = Arrays.stream(str.split(" ")).map(s -> new StringBuffer(s).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }

    private static void commonElements() {
        // How do you find common elements between two arrays?
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        List<Integer> commonElements = list1.stream().filter(list2::contains).toList();
        System.out.println(commonElements);
    }

    private static void sumAndAverage() {
        // Given an integer array, find sum and average of all elements?
        int[] a = new int[]{45, 12, 56, 15, 24, 75, 31, 89};
        int sum = Arrays.stream(a).sum();
        double average = Arrays.stream(a).average().orElse(0);

        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
    }

    private static void sortListOfStringLengthWise() {
        // Given a list of strings, sort them according to increasing order of their length?
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        List<String> lengthWiseSorted = listOfStrings.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println(lengthWiseSorted);
    }

    private static void findSecondLargest() {
        // Find second-largest number in an integer array?
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer secondLargest = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println(secondLargest);
    }

    private static void sumOfDigits() {
        // Find sum of all digits of a number in Java 8?
        int i = 15623;
//        Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(s-> Integer.parseInt(s)));
        int sum = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }

    private static void isAnagram() {
        // Java 8 program to check if two strings are anagrams or not?
        String s1 = "RaceCar";
        String s2 = "CarRace";
        String result = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String result2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if (result.equalsIgnoreCase(result2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

    private static void threeMinimumAndMaximum() {
        //How do you get three maximum numbers and three minimum numbers from the given list of integers?
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("Three minimum");
        List<Integer> threeMinimum = listOfIntegers.stream().sorted().limit(3).toList();
        System.out.println(threeMinimum);
        System.out.println("Three maximum");
        List<Integer> threeMaximum = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(threeMaximum);
    }

    private static void mergeTwoUnSortedArrayWithoutDuplicate() {
        //  How do you merge two unsorted arrays into single sorted array without duplicates?
        int[] a = new int[]{4, 2, 5, 1};
        int[] b = new int[]{8, 1, 9, 5};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();
        System.out.println(Arrays.toString(c));
    }

    private static void mergeTwoUnSortedArray() {
        // How do you merge two unsorted arrays into single sorted array using Java 8 streams?
        int[] a = new int[]{4, 2, 7, 1};
        int[] b = new int[]{8, 3, 9, 5};

        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));
    }

    private static void minMax() {
        // Given a list of integers, find maximum and minimum of those numbers?

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        Integer min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();

        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);
    }

    //  From the given list of integers, print the numbers which are multiples of 5?
    private static void getMultipleOf5() {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        List<Integer> multipleOf5 = listOfIntegers.stream().filter(i -> i % 5 == 0).toList();
        System.out.println(multipleOf5);
    }
}
