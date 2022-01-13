package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        String reverseStr = StringUtility.reverse(str);
        System.out.println(reverseStr);

        String s1 = "Wooden Spoon";
        String reverseS1 = StringUtility.reverse(s1);
        System.out.println(reverseS1);

        System.out.println("--------------------------");

        String word = "Civic";

        boolean palindrome =  StringUtility.isPalindrome(word);
        System.out.println(palindrome);

        System.out.println("------------------------");

        String[] names = {"Anna","Java","Python","Racecar","Mom","Cydeo"};
        int count = 0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);

        System.out.println("-----------------");

        String s2 = "aaaaccbbbbbbs";

        String noDup =  StringUtility.removeDuplicates(s2);
        System.out.println(noDup);

        System.out.println("-----------------------");


    }


}
