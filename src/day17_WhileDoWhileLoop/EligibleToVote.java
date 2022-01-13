package day17_WhileDoWhileLoop;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = scan.nextInt();

        while(!(age>=1 && age<=120)){
            System.err.println("Invalid, re-enter:");
            age = scan.nextInt();
        }
        System.out.println("US citizen? yes/no:");
        String answer = scan.next();

        while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid, re-enter:");
            answer = scan.next().toLowerCase();
        }
        if(age>=18 && answer.equals("yes")){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }


    }
}
