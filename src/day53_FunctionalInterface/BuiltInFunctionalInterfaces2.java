package day53_FunctionalInterface;

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
    }
}
