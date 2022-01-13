package day10_NestedIf;

public class DaysOfWeek {

    public static void main(String[] args) {

        int n = 7; // n = 1 -7
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
        }else if (n == 7){
            day = "Saturday";
        }else
            System.out.println("Invalid");

        System.out.println("day = " + day);

        System.out.println("--------------------");

        String day1 = (n == 1)? "Sunday" :(n == 2)? "Monday" :(n == 3)? "Tuesday" :(n == 4)? "Wednesday" :(n==5)? "Thursday"
                :(n == 6)? "Friday" : "Saturday";
        System.out.println(day1);



    }
    }

