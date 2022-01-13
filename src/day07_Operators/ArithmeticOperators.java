package day07_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
/*
        int num1 = 100;
        int num2 = 15;

        // 10 / 3 = 3 integer result and remainder of 1

        int division = num1/num2;
        int remainder = num1%num2;

        System.out.println("division = " + division);
        System.out.println("remainder = " + remainder);

        System.out.println(num1 + " divided by " + num2 + " equals " + division + " with the remainder of " + remainder);
*/


        int num =2;
        boolean b =true;

        switch (num){
            case 0:
                b = false;
            case 1:
                System.out.println(1);
            case 2:
                if (b){
                    System.out.println(2);
                }else{
                    b = false;
                }
            case 3:
                if(b){
                    System.out.println(3);
                }else{
                    break;
                }
            case 4:
                System.out.println(4);
            case 5:
                if(!b){
                    break;
                }
                System.out.println(5);

        }
    }
}
