package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 1000, b = 15000, c = 20000;

        boolean aMed = (a > b && a < c) || (a > c && a < b);
        // b is min and c is max           c is min and b is max
        boolean bMed = (b > a && b < c) || (b > c && b < a);
        // a is min and c is max           c is min and a is max
        //boolean cMed = (c > a && c < b) || (c > b && c < a);
        boolean cMed = !aMed && !bMed;
        //otherwise

        if (aMed){
            System.out.println(a + " is median number.");
        }
        if (bMed){
            System.out.println(b + " is median number.");
        }
        if (cMed){
            System.out.println(c + " is median number.");
        }
    }
}
/*
. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

 */