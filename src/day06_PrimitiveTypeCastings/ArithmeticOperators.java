package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        /*
        division
        in math 10/4=2.5

        in java 10/4=2
        10.0/4=2.5
         */
        System.out.println(100 / 3);
        System.out.println(100.0 / 3);
        System.out.println((double) 10 / 4);

        int a = 100;
        double b = a/6; //16.0
        System.out.println(b);

        double c =a/6d; // 16.66666
        System.out.println(c);
        System.out.println(100d);

        /*
        int divided by int ====> int
        decimal/int =====> decimal
        dec/dec =====> dec
         */

    }

}