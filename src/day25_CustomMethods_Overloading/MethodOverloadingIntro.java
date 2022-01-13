

package day25_CustomMethods_Overloading;
import java.util.Arrays;
public class MethodOverloadingIntro {

    public static void main(String[] args) {
        
        int[] intArray = {5,5,7,98,0,-1};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5,11.5,5.0};
        Arrays.sort(doubleArray);

        char[] charArray = {'E','F','N','B','A'};
        Arrays.sort(charArray);

        int sum1 = sumOfNumbers(10,20);
        int sum2 = sumOfNumbers(10,20,30,40);
        double sum3 = sumOfNumbers(1.34,23.45);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        
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
