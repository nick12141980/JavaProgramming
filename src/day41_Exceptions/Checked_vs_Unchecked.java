package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;
import java.util.Locale;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        //unchecked

        int a = 10;
        int b = 0;

       // System.out.println(a / b);

        char[] characters = {'a','b','c'};
     //  System.out.println(characters[99]);

        Student student = null;

     //   System.out.println(student.getName());
       // student.study();

        String str = "Wooden Spoon";

      //  str = null;

        System.out.println(str.toUpperCase());

        //checked

        System.out.println("Hello");

        //Thread.sleep(3000);

        System.out.println("Cydeo");

       // FileInputStream file = new FileInputStream("path");




    }


}
