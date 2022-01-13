package day13_String;

import java.util.Arrays;
import java.util.SplittableRandom;

public class Test {

    public static void main(String[] args) {

        String s = "the game was tied at 2-2";
        String s2 = s.substring(5);
        int index1 = s.indexOf("game");
        int index2 = s2.indexOf("game");
        if( index1 == index2){
            System.out.println(index1);
        }else{
            System.out.println(index2);
        }
/*
        String z = "popcorn";
        z = z.substring(1,8);
        if(z.equals("opcor")){
            System.out.println(z.length());
        }else{
            System.out.println("o,","a");
        }

*/
        /*
        String a = "today I will go to the beach";
        boolean b = a.contains("i");
        boolean c =a.substring(12).startsWith("go");

        String result = b && c ? "go":"din't go";
        System.out.println(result);


        int number = 5;
        while (number<100){
            number += number;
        }
        System.out.println(number);

        int d =0;
        do{
            d = d++ + --d - (d%3);
        }while (++d < 4);
        System.out.println(d);
/*
        String str = "cybertek";

        for( int i = 0; i <= str.length(); i+=2){
            System.out.print(str.charAt(i));
        }
      */
        //String input = "today it will be 100 degrees !";
        //int n = 0;
        //while (n++ < input.length()){
       //     if(n==8){
        //        continue;
         //   }else if(n ==9){
         //       break;
         //   }
         //   System.out.print(input.charAt(++n));
       // }

        int count =0;

        for (int a=0; a<4; a++){
            if (a==3){
                continue;
            }
            for (int b = a+1; b<5; b++){
                count++;
                if (b==3){
                    break;
                }
            }
        }
        System.out.println(count);



        double[] doub = new double[4];

        doub[0] = 1.0;
        doub[2] = 42.1;
        doub = new double[4];
        doub[1] = 17.2;
        doub[3]= doub.length;

        System.out.print(Arrays.toString(doub));
/*
        String[] strs = {"display","population","meeting","copy","franchise"};

        int a = strs.length;
        int b = strs[5].length();

        System.out.println(a+" "+b);


   */
        System.out.println();
        String[] words = {"one","two","three","four"};
        String[] other = new String[words.length];
        int ind = 0;

        for (String word : words) {
            other[ind++] = word+ word.length();
        }
        System.out.println(Arrays.toString(other));

/*
        int[] arr = {1,3,12,5,24,7,9,10};
        boolean[] bArr = new boolean[arr.length];

        for(int i = arr.length; i>-1;i--){
            if (arr[i] % 2==0){
                bArr[arr.length-1-i] = true;
            }
        }
        System.out.println(Arrays.toString(bArr));
*/
        int[] nums = {14,1,84,97,1234,46};
        int total =0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2 != 0){
                total += 3;
            }else{
                total += 10;
            }
            if(i%3==0){
                total -= 15;
            }
        }
        System.out.println(total);



        }



    }







