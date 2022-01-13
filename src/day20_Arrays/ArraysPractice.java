package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        int[] numbers = {10,20,50,70};
        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------");

        int[] scores = new int[5];

        System.out.println(Arrays.toString(scores));

        scores[1] = 85;
        scores[scores.length -1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;

        System.out.println(Arrays.toString(scores));

        System.out.println("----------------------------");

        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

        //System.out.println(months[0]);//Jan
        //System.out.println(months[1]);//Feb

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        System.out.println("-----------------");

        for(int i = months.length-1; i >=0;i--){
            System.out.println(months[i]);
        }

    }
}
