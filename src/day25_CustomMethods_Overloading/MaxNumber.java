package day25_CustomMethods_Overloading;

public class MaxNumber {

    public static void main(String[] args) {

        int[] array = {1,2,3,6,8,9};
       int max = maxNumber(array);
        System.out.println(max);

        double[] arr2 = {1.3,4.5,7.9,10.0};
        double max2 = maxNumber(arr2);
        System.out.println(max2);
    }


    public static int maxNumber(int[] arr){

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static double maxNumber(double[] arr){

        double max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
