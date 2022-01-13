package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_nextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = input.nextLine();

        System.out.println("Programming Language: ");
        String lang = input.nextLine();

        System.out.println("Enter age: ");
        int age = input.nextInt(); //keeps Enter key in Scanner

        input.nextLine(); // Takes out Enter key
        //MUST be put in after any method except nextLine before another nextLine

        System.out.println("Enter school name: ");
        String scName = input.nextLine();

        System.out.println("name = " + name);
        System.out.println("lang = " + lang);
        System.out.println("age = " + age);
        System.out.println("scName = " + scName);

        input.close();




    }
}
