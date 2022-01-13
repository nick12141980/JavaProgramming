package day11_Switch_Scanner;

public class Grades {

    public static void main(String[] args) {

        char grade = 'C';
        String result ="";

        switch (grade){
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Invalid";

        }
        System.out.println(result);


    }
}
/*
 Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid
 */