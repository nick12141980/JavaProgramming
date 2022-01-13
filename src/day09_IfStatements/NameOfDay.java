package day09_IfStatements;

public class NameOfDay {

    public static void main(String[] args) {

        int n = 3; // n = 1 -7
        String day = null;

        if (n == 1){
            day = "Sunday";
        }else if (n == 2){
            day = "Monday";
        }else if (n == 3){
            day = "Tuesday";
        } else if (n == 4){
            day = "Wednesday";
        }else if (n == 5){
            day = "Thursday";
        }else if (n == 6){
            day = "Friday";
        }else if (n == 6){
            day = "Saturday";
        }else
            System.out.println("Invalid");

        System.out.println("day = " + day);
    }
}
