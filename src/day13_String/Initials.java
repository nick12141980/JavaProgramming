package day13_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        System.out.println("First name: ");
        String firstName = input.next();
        System.out.println("Last name" );
        String lasName = input.next();

        char f = firstName.charAt(0);
        char l = lasName.charAt(0);

        String initial = f+"."+l+".";


        System.out.println(initial);



        String result = 3425 > (1000*6)? "garden" : "patio";
        result.substring(2);
        System.out.println(result);




    }


}
