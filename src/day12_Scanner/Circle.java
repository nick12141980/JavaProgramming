package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius:");


        double rad = input.nextDouble();
        double area = rad*rad*3.14;
        double per = 2*rad*3.14;

        System.out.println("area = " + area);
        System.out.println("per = " + per);

        input.close();


    }
}
