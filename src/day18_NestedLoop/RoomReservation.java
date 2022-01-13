package day18_NestedLoop;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {
        /*
        Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

         */
        int kingPrice = 120;
        int queenPrice = 100;
        int singlePrice = 80;
        int roomPrice;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Which room?");
            String roomType = scan.next().toLowerCase();
            if (roomType.equals("king")){
                roomPrice = 120;
            }else if(roomType.equals("queen")){
                roomPrice = 100;
            }else{
                roomPrice = 80;
            }

            System.out.println("How many nights?");
            int numNights = scan.nextInt();
                System.out.println("Another room?");
                String yesNo = scan.next().toLowerCase();

            while (!(roomType.equals("king") || roomType.equals("queen") || roomType.equals("single") && numNights>0)){
                System.out.println("Invalid re-enter:");
                System.out.println("Which room?");
                roomType = scan.next().toLowerCase();
                System.out.println("How many nights?");
                numNights = scan.nextInt();
                System.out.println("Another room?");
            }

                while(yesNo.equals("yes")) {
                    System.out.println("Which room?");
                    roomType = scan.next().toLowerCase();
                    System.out.println("How many nights?");
                    numNights = scan.nextInt();
                    System.out.println("Total is "+roomPrice*numNights);
                    System.out.println("Another room?");
                    yesNo = scan.next().toLowerCase();
                }
            if (yesNo.equals("no")) {
                System.out.println("Total is "+roomPrice*numNights);
                break;
            }



                }

            }




        }



