package day17_WhileDoWhileLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        String username = "";
        String password = "";
        Scanner scan = new Scanner(System.in);
        int attempt = 3;

        System.out.println("Enter username: ");
        username = scan.next();
        System.out.println("Enter password: ");
        password = scan.next();

        if((username.equals("Cydeo") && password.equals("Cydeo123"))){
            System.out.println("Logged in");
        }else{

        while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && attempt > 0){
            /*
            System.out.println("Enter username: ");
            username = scan.next();
            System.out.println("Enter password: ");
            password = scan.next();
            */
            System.out.println("Wrong, do it again: "+attempt+" attempts left");

            System.out.println("Enter username: ");
            username = scan.next();
            System.out.println("Enter password: ");
            password = scan.next();
            attempt--;
            if((username.equals("Cydeo") && password.equals("Cydeo123"))){

                System.out.println("Logged in");
            }else{
                System.out.println("Account locked");
            }

        }
        scan.close();


    }
}
}