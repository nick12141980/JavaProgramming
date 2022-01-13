package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    /*
    1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}

     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arr = replace(arr, 1, 30);
        System.out.println(Arrays.toString(arr));

        String[] arr2 = {"java","python","c++","ruby"};
        arr2 = replace(arr2,2,"c#");
        System.out.println(Arrays.toString(arr2));


    }


    //replaces ann element of an array with given index with a new element
    public static int[] replace(int[] array, int index, int newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index; " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces ann element of an array with given index with a new element
    public static double[] replace(double[] array, int index, double newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index; " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces ann element of an array with given index with a new element
    public static char[] replace(char[] array, int index, char newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index; " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces ann element of an array with given index with a new element
    public static String[] replace(String[] array,int index, String newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index; " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }


}
