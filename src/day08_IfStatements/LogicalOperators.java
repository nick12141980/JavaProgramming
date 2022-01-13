package day08_IfStatements;

import java.util.SplittableRandom;

public class LogicalOperators {
    public static void main(String[] args) {

        int age = 18;
        String citizen = "USA";
        String name = "Aaron";

        boolean isEligible = age >= 18 && citizen == "USA";

        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("-----------------------");

        String name2 = "Josh";
        int creditScore = 800;
        int age2 = 23;
        int income = 600001;

        boolean isEligibleForLoan = creditScore >= 700 && age2 >=21 && income >=60000;

        System.out.println(name2 + " is eligible for loan: " + isEligibleForLoan);

        System.out.println("--------------------------");

        String name3 = "Emma";
        char gender = 'F';
        int age3 = 23;

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');

        System.out.println(name3 + " is eligible for service: " + isEligible3);

        System.out.println("-------------------------------------");

        String name4 = "James";
        String countryOfBirth = "USA";
        boolean marriedToUSCitizen = false;
        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;

        System.out.println(name4 + " is eligible to apply: " + isEligible4);

        System.out.println("---------------------------");

        String name5 = "Anna";
        double gpa = 3.5;
        int familyIncome = 4000000;
         boolean isElogible5 = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println();

        System.out.println("----------------------------");

        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3 = !result2;

        System.out.println("result3 = " + result3);

        System.out.println("----------------------------");

        int score = 85;
        boolean pass = score >= 60;
        boolean fail = !pass;

        System.out.println("fail = " + fail);
        System.out.println("pass = " + pass);




    }
}
