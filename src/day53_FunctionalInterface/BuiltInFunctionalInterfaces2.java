package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
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

        System.out.println("----------------------------------------------------");

        //creat a function tha takes 2 integers and return maximum integer
        BiFunction<Integer, Integer, Integer> maxNum = (a, b)->(a>b)?a:b;

        System.out.println("maxNum.apply(100, 200) = " + maxNum.apply(100, 200));

        //create a function that van merge two integer arrays into a List
        BiFunction<int[], int[], List<Integer>> merge = (x, y) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : x) result.add(each);
            for(int each : y) result.add(each);
            return result;
        };
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 ={4,5,6,7,8,9};

        List<Integer> nums = merge.apply(arr1, arr2);

        System.out.println("----------------------------------------------------");

        //create a function that takes a List of Integer and List of String And merge them into a Map
        /*
        names ==> {"Josh", "Daniel"}
        score ==> {100, 110}
        map ==> {Josh=100, Daniel=110}
         */
        BiFunction<List<String>, List<Integer>, Map<String, Integer>> merge2 = (j, k) -> {
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < j.size(); i++) {
                map.put(j.get(i), k.get(i));
            }

            return map;
        };

        List<String> names = new ArrayList<>(Arrays.asList("Layan", "Ksenia","Aygun");
        List<Integer> scores = new ArrayList<>(Arrays.asList(90, 95, 100));

        Map<String, Integer> students = merge2.apply(names, scores);



    }
}
