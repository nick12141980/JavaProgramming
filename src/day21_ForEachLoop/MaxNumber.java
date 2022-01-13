package day21_ForEachLoop;

public class MaxNumber {

    public static void main(String[] args) {

        int[]  numbers = {1,45,7,88,100};
        int max = numbers[0];

        for (int each : numbers) {
            if(each>max){
                max = each;
            }
        }
    }
}
