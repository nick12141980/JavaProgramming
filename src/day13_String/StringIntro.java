package day13_String;


public class StringIntro {

    public static void main(String[] args) {

        String name = "Wooden Spoon";
        String name2 = "Wooden Spoon";

        System.out.println(name == name2);//true

        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");

        System.out.println(str1 == str2);//false

        System.out.println("---------------------------");

        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1.equals(s2)); //true; checks the value, ignores the location in Java Heap




    }
}
