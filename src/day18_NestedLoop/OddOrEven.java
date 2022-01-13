package day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    while(true) {
        System.out.println("Enter a number:");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        System.out.println("Another number?");
        String a = scan.next().toLowerCase();

        while (!(a.equals("yes") || a.equals("no"))){
            System.out.println("Re-enter");
            a = scan.next().toLowerCase();
        }

        if(a.equals("no")){
            break;
        }
        scan.close();
    }

    }
}
