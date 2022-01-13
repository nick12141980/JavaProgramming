package day25_CustomMethods_Overloading;

public class SumOfNumbers {

    /*
    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
     */

    public static void main(String[] args) {
        int sum = sumOfNumbers(3,6);
        System.out.println(sum);

        int sum2 = sumOfNumbers(20,10,30);
        System.out.println(sum2);

        int sum3 = sumOfNumbers(1,3,5,6);
        System.out.println(sum3);

        double sum4 = sumOfNumbers(2.4,6.7);
        System.out.println(sum4);
    }

    public static int sumOfNumbers(int num1,int num2){
        return num1 + num2;
    }

    public static double sumOfNumbers(double num1, double num2){
        return num1+num2;
    }

    public static double sumOfNumbers(double num1,double num2, double num3){
        return sumOfNumbers(num1,num2)+num3;
    }

    public static int sumOfNumbers(int num1,int num2, int num3){
        return num1+num2+num3;
    }

    public static  int sumOfNumbers(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }

    public static int sumOfNumbers(int num1,int num2,int num3,int num4, int num5){
        return sumOfNumbers(num1,num2,num3,num4)+num5;
    }

}
