package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,7,8,9,9};
        int[] unique = uniqueElements(arr);
        System.out.println(Arrays.toString(unique));
    }

    //creates an array from unique elements of a given array
    public static int[] uniqueElements(int[] array){
        int[] result = {};
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) == 1){
               result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //creates an array from unique elements of a given array
    public static double[] uniqueElements(double[] array){
        double[] result = {};
        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //creates an array from unique elements of a given array
    public static char[] uniqueElements(char[] array){
        char[] result = {};
        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //creates an array from unique elements of a given array
    public static String[] uniqueElements(String[] array){
        String[] result = {};
        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }



}
