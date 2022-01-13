package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        System.out.println("str = " + str);
        String str2 = str.replace("Java" , "Python");
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        System.out.println("email = " + email);
        String email2 = email.replace("yahoo" , "gmail");
        System.out.println("email2 = " + email2);

        String sentence = "Java Java Python Python C++ C# Python ";
        sentence = sentence.replace("Python " , "");
        System.out.println("sentence = " + sentence);

        String s = "Dog Dog Dog Dog Dog Dog";
        System.out.println("s = " + s);
        s = s.replace("Dog" , "Cat");
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        System.out.println("s2 = " + s2);
        s2 = s2.replace(" C#" , " Java");
        System.out.println("s2 = " + s2);

        String s3 = "Java";
        System.out.println("s3 = " + s3);
        s3 = s3.replace("a" , "e");
        System.out.println("s3 = " + s3);

        System.out.println("-------------------------------");

        String result = "Java Java Java";
        result = result.replaceFirst("Java" , "Python");
        System.out.println(result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#" , "Java");
        System.out.println(result2);

        String result3 = "Java";

        result3 = result3.replaceFirst("va" , "vo");
        System.out.println(result3);



    }
}
