package day27_WrapperClasses;

public class WrapperClassIntro {

    public static void main(String[] args) {

        int num1 = 200;
        Integer n1 = num1; //autoboxing

        int num2 = n1; //unboxing

        System.out.println("-----------------------");

        Integer integerValue = 100;

        long longValue = integerValue;

        System.out.println("---------------------");

        int num3 = 200;
        Integer num4 = num3; // autoboxing

        Integer z = 900;
        Integer y = z;

        System.out.println("------------------------");

        int[] numbers = {1,2,3,4,5};
        Integer[] numbers2 = {1,2,3,4,5};



    }

}
