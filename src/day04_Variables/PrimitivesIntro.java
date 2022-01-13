package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        //age: 40 years old
        byte age = 40;

        //weight: 200 pounds
        //byte weight = 200; 200 is out of byte' range

        short weight = 200; //200 is within the range of short
        //short salary = 100000; 100000 is out of shorts' range

        int salary = 100_000; //preferred data type for integer numbers

        long asset = 33_333_333_333L;

        //tax: 0.26
        float tax = 0.26F;

        double PI = 3.14;

        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);
         char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        char ch3 = 287;
        System.out.println("ch3 = " + ch3);
        char gender = 'F';
        char yesNo = 'Y';
        char ch4 = 1500;
        System.out.println("ch4 = " + ch4);

        boolean isEmployed = true;
        boolean isMarried = false;

        boolean result = 100 > 300;

        String name = "Wooden Spoon";
        String city = "Brooklyn";
        String state = "NY";
        String country = "USA";

            System.out.println("name = " + name);
    }



}
