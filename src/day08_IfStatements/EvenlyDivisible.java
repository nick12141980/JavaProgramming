package day08_IfStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 100;
        boolean isDivisbleBy2 = number%2==0;
        boolean isDivisibleBy3 = number%3 == 0;
        boolean isDivisibleBy5 = number%5 == 0;

        System.out.println(number+" is divisible by 2: "+ isDivisbleBy2);
        System.out.println(number+" is divisible by 3: "+ isDivisibleBy3);
        System.out.println(number+ "is divisible by 5: "+ isDivisibleBy5);

        System.out.println("---------------------");

        int year = 2000;

        boolean isLeapYear = year % 4 == 0;

        System.out.println(year+" is leap year: "+isLeapYear);
    }
}
