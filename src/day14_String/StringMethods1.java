package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "  batch     25       "; //removes spaces NOT separating to characters
        System.out.println(str1);
        str1 = str1.trim();
        System.out.println(str1);

        System.out.println("----------------");

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");

        int n2 = str2.indexOf("ool");
        System.out.println(n2);

        String str3 = "Java Programming Language";
        int n3 = str3.indexOf("ang");
        System.out.println("n3 = " + n3);
        int n4 = str3.indexOf("gu");
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);

        System.out.println("-----------------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        System.out.println("firstA = " + firstA);
        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);
        int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);
        int thirdA = s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);
        int fourthA = s.indexOf("ava W");
        System.out.println("fourthA = " + fourthA);
        int fifthA = s.lastIndexOf("a W");
        System.out.println("fifthA = " + fifthA);
        int sixthA = s.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);
        int seventhA = s.lastIndexOf("a ");
        System.out.println("seventhA = " + seventhA);

        System.out.println("------------------------");






    }
}
