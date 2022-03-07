package day53_FunctionalInterface;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
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

        System.out.println("----------------------------------------------------");

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid", "SM");
        scrumTeam1.put("Nikita", "Developer");
        scrumTeam1.put("Alina", "Developer");
        scrumTeam1.put("Mert", "PO");
        scrumTeam1.put("Lee", "SDET");

        scrumTeam1.forEach( (k, v) -> {
            System.out.println(k+" "+v);
        });

    }
}
