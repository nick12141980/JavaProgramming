package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,4,4,4,5,5,5,6,7,8));
        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);

        int[] arr1 = {1,1,2,3,4,4,4,5,5,5,6,7,8};
        arr1 = Arrays.stream(arr1).distinct().toArray();
        System.out.println(Arrays.toString(arr1));

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2 = list2.stream().skip(5).collect(Collectors.toList());
        System.out.println(list2);

        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};
        nums2 = Arrays.stream(nums2).skip(4).toArray();
        System.out.println(Arrays.toString(nums2));

    }

}
