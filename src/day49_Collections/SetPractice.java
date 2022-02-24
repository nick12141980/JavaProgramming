package day49_Collections;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon","Book","Pen","Phone","Wooden Spoon","Wooden Spoon"};

        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        arr = set1.toArray(new String[0]);

        System.out.println(set1);
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000,300,1000,200,300,400,500,600,10,10,20,30,40,10));

        list = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list);

        String[] array = {"A","A","B","C"};

        Set<String> s = new LinkedHashSet<>();

        s.addAll(Arrays.asList(array));

        Integer[] nums = {1,2,3,4,5,6,7,8,1,1,2,3,4,4,5,5,6,7,8,9};

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums));

        String str ="aaaabbbbcccdddee";
        String result="";

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int count = Collections.frequency(Arrays.asList(str.split("") ), each);
            result += each+count;
        }

        System.out.println(result);




    }
}
