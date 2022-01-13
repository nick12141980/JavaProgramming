package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = input.nextLine();

        System.out.println("Enter building number: ");
        String buildingNumber = input.next();

        input.nextLine();

        System.out.println("Enter street: ");
        String street = input.nextLine();

        System.out.println("Enter city: ");
        String city = input.nextLine();

        System.out.println("State: ");
        String state = input.next();

        System.out.println("Zip code: ");
        String zip = input.next();

        System.out.println(name);
        System.out.println(buildingNumber+" "+street);
        System.out.println(city+", "+state+", "+zip);

        input.close();







    }
}
