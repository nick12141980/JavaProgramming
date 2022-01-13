package day20_Arrays;

public class MinNumberArray {

    public static void main(String[] args) {

        int[] numbers = {1,78,45,0,34,-5};

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min = numbers[i];
            }

        }
        System.out.println(min);

    }
}
