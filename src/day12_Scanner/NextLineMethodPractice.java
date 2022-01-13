package day12_Scanner;

import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:  ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter name: ");
        String name = input.nextLine();

        System.out.println("Enter GPA: ");
        double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("Enter school name: ");
        String scName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("gpa = " + gpa);
        System.out.println("scName = " + scName);

        input.close();





    }
}
