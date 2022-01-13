package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {


    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,4,5,6,1,1};

        arr = replaceAll(arr,1,15);

        System.out.println(Arrays.toString(arr));


    }

    //replaces all matching old value with a new value in an array
    public static int[] replaceAll(int[] array, int oldValue, int newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    //replaces all matching old value with a new value in an array
    public static double[] replaceAll(double[] array, double oldValue, double newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    //replaces all matching old value with a new value in an array
    public static char[] replaceAll(char[] array, char oldValue, char newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    //replaces all matching old value with a new value in an array
    public static String[] replaceAll(String[] array, String oldValue, String newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(oldValue)){
                array[i] = newValue;
            }
        }
        return array;
    }


}
/*
RecplaceAll Task:
        2.1 Create a method named replace that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}

 */