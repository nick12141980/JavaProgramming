package day42_Exceptions;

public class DisadvantagesOfThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");

        //sleep(2); //throws

        System.out.println("Hello World");

        System.out.println("------------------");

        System.out.println("Hello");
        MorningWorkout.sleep(2); //try catch
        System.out.println("Cydeo");
    }


    public static void sleep(double seconds) throws InterruptedException {
        Thread.sleep((long) (seconds * 1000));
    }
}
