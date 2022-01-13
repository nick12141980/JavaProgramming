package utilities;

import java.util.Arrays;

public class StringUtility {

    //prints each character of a given string
    public static void printEachChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    //reverses a string and returns a new string
    public static String reverse(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    //returns true if a string is palindrome otherwise returns false
    public static boolean isPalindrome(String str){
       return reverse(str).equalsIgnoreCase(str);
    }

    //checks if a string is anagram, returns boolean
    public static boolean anagram(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }

    //remove duplicates from a string, returns a string
    public static String removeDuplicates(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(!(result.contains(""+each))){
                result += each;
            }
        }
        return result;
    }

}
