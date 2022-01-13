package day15_ForLoop;

import java.util.Scanner;

public class SumOFNumbers {

    public static void main(String[] args) {

        double sum = 0;

        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("--------------------------");

        Scanner scan = new Scanner(System.in);
        int total = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Enter number: ");
            total += scan.nextInt();
        }
        System.out.println(total);
        scan.close();




    }
}
