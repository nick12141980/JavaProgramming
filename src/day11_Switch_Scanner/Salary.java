package day11_Switch_Scanner;

public class Salary {

    public static void main(String[] args) {
        double salary = 75000;
        boolean isMarried = true;
        double taxRate = 0;

        if (salary>=130000){
            taxRate = 0.35;
        }else if(salary<=100000){
            taxRate = 0.3;
        }else if (salary>=80000){
            taxRate = 0.25;
        }else{
            taxRate = 0.2;
        }
        if(isMarried){
            taxRate -= 0.05;
        }

        double salaryAfterTax = salary - (salary*taxRate);
        System.out.println("Salary after tax is "+salaryAfterTax);




    }
}
/*
. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */