package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7};
        ArraysUtility.printEachElement(arr1);

        System.out.println("----------------------");

        double[] arr2 = {1.2,2.3,4.5,6.7};
        ArraysUtility.printEachElement(arr2);

        char[] arr3 = {'a','b','c','d'};
        ArraysUtility.printEachElement(arr3);

        String[] names = {"David", "Elvira","Ali","Igor"};
        ArraysUtility.printEachElement(names);

        int[] n1 = {1,2,3,4,5,6};
        int max1 = ArraysUtility.max(n1);
        System.out.println(max1);

        double[] n2 = {2.3,4.5,6.7,8.9};
        double max2 = ArraysUtility.max(n2);
        System.out.println(max2);

        System.out.println("----------------");
        
        int[] a1 = {1,2,3,4,5,6};
        boolean r1 = ArraysUtility.contains(a1,5);
        System.out.println("r1 = " + r1);



    }


}
