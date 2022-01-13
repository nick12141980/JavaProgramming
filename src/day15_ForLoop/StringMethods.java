package day15_ForLoop;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String str = " ";

        boolean r = str.isEmpty();
        System.out.println("r = " + r);

        boolean r2 = str.isBlank();
        System.out.println("r2 = " + r2);

        System.out.println("-----------------");

        String s1 = "CYDEO", s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("-------------------");

        String sent = "My favorite programming language is Java ";
        boolean hasCSharp = sent.contains("C#");
        boolean hasJava = sent.contains("Java");
        System.out.println(hasCSharp);
        System.out.println(hasJava);

        boolean hasJava2 = sent.toLowerCase().contains("java");
        System.out.println(hasJava2);

        System.out.println("---------------------");

        String input1 = "i love jAva";
        String input2 = "Java";

        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));
        System.out.println(input1.contains("Java"));

        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));

        System.out.println("------------------------");

        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden"); // ignores case sensitivity

        System.out.println(y);
        System.out.println(x);
        System.out.println(z);
    }
}
