package day53_FunctionalInterface;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BuiltInFunctionalInterfaces2 {

    public static void main(String[] args) {

        //Create a function that can check if the Integer is contained in an array of integer, return boolean
        BiPredicate<Integer[], Integer> contains = (a, b) -> {
            boolean result = false;
            for (Integer each : a) {
                if (each == b){
                    result = true;
                    break;
                }
            }
            return result;
        };

        Integer[] arr = {1,2,3,4,5,6,5,4,11,5,7,8,3};

        System.out.println("contains.test(arr, 11) = " + contains.test(arr, 11));

        System.out.println("----------------------------------------------------");

        //create a function that checks if two strings are anagram
        BiPredicate<String, String> anagram = (a, b) -> {
            String[] arr1 = a.split("");
            String[] arr2 = b.split("");

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        };

        System.out.println("----------------------------------------------------");
        //create a function that can print a given string given number of times
        BiConsumer<String , Integer> printMultipleTimes = (s, n) -> {
            for (int i = 0; i < n; i++){
                System.out.println(s);
            }
        };

        printMultipleTimes.accept("Java", 5);

        //create a function that takes first and last  and returns the formatted full name

    }
}
