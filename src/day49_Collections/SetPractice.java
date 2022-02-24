package day49_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon","Book","Pen","Phone","Wooden Spoon","Wooden Spoon"};

        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        arr = set1.toArray(new String[0]);

        System.out.println(set1);
        System.out.println(Arrays.toString(arr));


    }
}
