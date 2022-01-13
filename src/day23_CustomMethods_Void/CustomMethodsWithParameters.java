package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {
        oddEven(6);
        personsAge(1980);
        printNumbers(25,50);
    }

    //check if a number is odd or even
    public static void oddEven(int number){
        if (number%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    //function that displays age of a person
    public static void personsAge(int birthYear){
       int age = 2021 - birthYear;
        System.out.println("You are "+age+" years old.");
    }

    //print numbers between x and y
    public static void printNumbers(int x,int y){
        for (int i = x; i <= y; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
