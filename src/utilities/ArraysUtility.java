package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    //prints each decimal number of a double array in separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    //prints each character of a char array in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    //prints each string from a string array in a separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

    //returns the maximum number from an integer array
    public static int max(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    //returns the maximum number from a double array
    public static double max(double[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    //returns the minimum number from an integer array
    public static int min(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    //returns the minimum number from a double array
    public static double min(double[] array) {
        Arrays.sort(array);
        return array[0];
    }
    
    //checks if the integer is contained in a given array, returns boolean
    public static boolean contains(int[] arr, int element){
        boolean result = false;
        for (int each : arr) {
            if (each == element){
                result = true;
            }
        }
        return result;
    }

    //checks if a double is contained in a given array, returns boolean
    public static boolean contains(double[] arr, double element){
        boolean result = false;
        for (double each : arr) {
            if (each == element){
                result = true;
            }
        }
        return result;
    }

    //checks if a char is contained in a given array, returns boolean
    public static boolean contains(char[] arr, char element){
        boolean result = false;
        for (char each : arr) {
            if (each == element){
                result = true;
            }
        }
        return result;
    }

    //checks if a string is contained in a given array, returns boolean
    public static boolean contains(String[] arr, String element){
        boolean result = false;
        for (String each : arr) {
            if (each.equals(element)){
                result = true;
            }
        }
        return result;
    }

    //adds integer to int array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length+1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    //adds double to double array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length+1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    //adds char to char array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length+1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    //adds string to string array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    //returns the frequency of a given element of an array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
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

    //removes index from array, returns new array
    public static int[] removeElement(int[] array, int index){
        if(index < 0 || index >= array.length) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        int[] result = new int[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(i == index){
                continue;
            }
            result [j++] = array[i];
        }
        return result;
    }

    //removes index from array, returns new array
    public static double[] removeElement(double[] array, int index){
        if(index < 0 || index >= array.length) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        double[] result = new double[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(i == index){
                continue;
            }
            result [j++] = array[i];
        }
        return result;
    }

    //removes index from array, returns new array
    public static char[] removeElement(char[] array, int index){
        if(index < 0 || index >= array.length) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        char[] result = new char[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(i == index){
                continue;
            }
            result [j++] = array[i];
        }
        return result;
    }

    //removes index from array, returns new array
    public static String[] removeElement(String[] array, int index){
        if(index < 0 || index >= array.length) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        String[] result = new String[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(i == index){
                continue;
            }
            result [j++] = array[i];
        }
        return result;
    }

    //merges two arrays int
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = {};
        for (int each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merges two arrays double
    public static double[] merge(double[] arr1, double[] arr2){
        double[] result = {};
        for (double each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merges two arrays char
    public static char[] merge(char[] arr1, char[] arr2){
        char[] result = {};
        for (char each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merges two arrays String
    public static String[] merge(String[] arr1, String[] arr2){
        String[] result = {};
        for (String each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //reverses an array int
    /*
   public static int[] reverse(int[] array){

        int[] result = new int[array.length];

        for (int i = array.length - 1,j = 0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }

    //reverses an array double
    public static double[] reverse(double[] array){

        double[] result = new double[array.length];

        for (int i = array.length - 1,j = 0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }

    //reverses an array char
    public static char[] reverse(char[] array){

        char[] result = new char[array.length];

        for (int i = array.length - 1,j = 0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }

    //reverses an array String
    public static String[] reverse(String[] array){

        String[] result = new String[array.length];

        for (int i = array.length - 1,j = 0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }
*/

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

    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){
        int[] result = {};
        for (int each : array) {
            if(!(ArraysUtility.contains(result,each))){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){
        double[] result = {};
        for (double each : array) {
            if(!(ArraysUtility.contains(result,each))){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){
        char[] result = {};
        for (char each : array) {
            if(!(ArraysUtility.contains(result,each))){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){
        String[] result = {};
        for (String each : array) {
            if(!(ArraysUtility.contains(result,each))){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
}