package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];

        for(char i = 'A',j = 0; i<='Z' && j < letters.length; i++, j++){
           letters[j] = i;
        }
        System.out.println(Arrays.toString(letters));

        for (int i = 0, j = 'A'; i < letters.length ; i++,j++) {
            letters[i] = (char)j;
        }
        System.out.println(Arrays.toString(letters));

        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch++;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("------------------------");

        char[] letters2 = new char[26]; // Z to A
        char ch1 = 'Z';
        for (int i = 0; i < letters2.length; i++) {
            letters2[i] = ch1--;
        }
        System.out.println(Arrays.toString(letters2));

    }
}
