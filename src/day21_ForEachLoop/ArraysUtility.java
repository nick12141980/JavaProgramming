package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        System.out.println(Arrays.toString(nums));

        String str = "java";

        System.out.println(str);

        System.out.println("-----------------------");

        int[] numbers = {94,100,65,86,78};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);//{55~100}

        System.out.println(Arrays.toString(numbers));

        System.out.println("Min number: " + numbers[0]);
        System.out.println("Max number: " + numbers[numbers.length-1]);

        String[] names = {"Gunay","Anna","Zuhal", "Ahmet","Maria","Sinem"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] words = {"Anna","ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        System.out.println("--------------------------");

        int[] arr1 = {1,2,3};
        int[] arr2 = {2,1,3};

        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("----------------------------");

        char[] ch1 = {'a','c','b'};
        char[] ch2 = {'c','a','b'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(arr1,arr2) == true){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

        System.out.println("-----------------------");


    }
}
