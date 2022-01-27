package day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age: ");

        int age = new Scanner(System.in).nextInt();

        if(age<0){
            throw new InputMismatchException("Age cannot be negative "+age);
        }

        if (age>=21){
            System.out.println("eligible");
        }else{
            throw new RuntimeException("must be 21 or over");
        }
    }
}
