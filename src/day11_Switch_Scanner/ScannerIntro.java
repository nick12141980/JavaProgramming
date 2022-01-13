package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an Integer number: ");
         int num1 = input.nextInt();

        System.out.println("Please enter a decimal: ");
         double num2 = input.nextDouble();


        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: "+(num2*num2));

        input.close(); // closes th scanner, it can't be used anymore




    }


}
