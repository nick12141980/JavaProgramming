package day24_CustomMethod_Return;

import java.io.FilterOutputStream;

public class ReturnMethodPractice2 {

    public static void main(String[] args) {

        //grade calculator
        //check the grade: 'A' --> "Excellent", 'B' ---> "Great"....

        String grade = grade(88);
        if(grade.equals("A")){
            System.out.println("Excellent");
        }else if(grade.equals("B")){
            System.out.println("Great");
        }else if(grade.equals("C")){
            System.out.println("Good");
        }else if(grade.equals("D")){
            System.out.println("Passes");
        }else{
            System.out.println("Failed");
        }

    }

    public static String grade(int score){

        String result = "";
        if(score<0 || score>100){
            System.out.println("Invalid");
        }else{
            result = (score>=90)? "A":(score>=80)? "B":(score>=70)? "C":(score>=60)? "D":"F";
        }
        return result;
    }



}
