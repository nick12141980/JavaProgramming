package day13_String;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = input.nextInt();

        System.out.println("Enter gender");
        String gender = input.next();

        input.nextLine();

        System.out.println("Enter full name: ");
        String name = input.nextLine();

        System.out.println("Enter phone number: ");
        long phone = input.nextLong();

        System.out.println("Enter zip code: ");
        int zip = input.nextInt();

        input.nextLine();

        System.out.println("Enter school name: ");
        String schName = input.nextLine();

        System.out.println("Enter city: ");
        String city = input.nextLine();

        System.out.println("Enter state: ");
        String state = input.next();

        System.out.println("Enter building number: ");
        int buildNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter street: ");
        String street = input.nextLine();

        input.close();

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(phone);
        System.out.println(buildNumber+" "+street);
        System.out.println(city+", "+state+", "+zip);
        System.out.println(schName);








    }
}
/*
Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in sperate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name

 */