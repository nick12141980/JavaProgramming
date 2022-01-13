package day24_CustomMethod_Return;

public class ReturnMethodsPractice {

    public static void main(String[] args) {

        int max = maxNumber(100,200);
        System.out.println(max*2);

    }

    public static int maxNumber(int num1,int num2){
        int maxNumber = 0;
        if(num1>num2){
            maxNumber = num1;
        }else{
            maxNumber = num2;
        }
        return maxNumber;
    }

}
