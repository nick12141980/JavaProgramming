package day21_ForEachLoop;

public class AverageNumber {

    public static void main(String[] args) {

        int[]  numbers = {1,45,7,88,100};
        double sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        double average = sum/numbers.length;
        System.out.println(average);

    }
}
