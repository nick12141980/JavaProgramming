package day13_String;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(2);

        System.out.println(thirdChar);

        System.out.println("--------------------");

        String s1 = "Batch 25 is an unknown batch";
        int n = s1.length();
        System.out.println(n);

        char lastChar = s1.charAt(s1.length()-1);
        System.out.println(lastChar);

        System.out.println("---------------------");

        String str ="wooden spoon";
        str = str.toUpperCase();// creates a new String object "WOODEN SPOON"

        System.out.println(str);

        System.out.println("--------------------");

        String s = "Today is the great day to learn Java Programming Language";
        System.out.println(s);
        s = s.toLowerCase();
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);

        String result = 3425 > (1000*6)? "garden" : "patio";
        result.substring(2);
        System.out.println(result);








    }
}
