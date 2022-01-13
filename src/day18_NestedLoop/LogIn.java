package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter username:");
        String u = scan.next();
        System.out.println("Enter password:");
        String p = scan.next();

        if(u.equals("Cydeo") && p.equals("WoodenSpoon")){
            System.out.println("Logged in.");
        }else{
            for (int i = 1; i < 3; i++) {
                System.out.println("Incorrect");

                System.out.println("Enter username:");
                 u = scan.next();
                System.out.println("Enter password:");
                 p = scan.next();

                if(u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("Logged in.");
                    break;
                }

                }
            if(!(u.equals("Cydeo") && p.equals("WoodenSpoon"))){
                System.err.println("Account locked");
            }
            scan.close();
        }


    }
}
