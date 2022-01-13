package day20_Arrays;


public class AverageNumber {

    public static void main(String[] args) {

        int sum = 0;
        int[]  numbers={10,20,30,40,50,60};

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum/numbers.length;
        System.out.println("average = " + average);

    }
}
