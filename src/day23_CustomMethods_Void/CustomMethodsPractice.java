package day23_CustomMethods_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {
        helloWorld5Times();
        helloCydeo5Times();
        evenNumbers1_10();
    }

    //create function that prints Hello World five times

    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

    //Hello Cydeo 5 times
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }

    //even numbers 1 ~ 10

    public static void evenNumbers1_10(){
        for (int i = 2; i <= 10; i +=2) {

                System.out.println(i);

        }
    }



}
