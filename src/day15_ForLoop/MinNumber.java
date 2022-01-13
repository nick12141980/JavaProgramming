package day15_ForLoop;
import java.util.Scanner;
public class MinNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 2147483647;

        for (int i = 1; i < 6; i++) {
            System.out.println("Enter number: ");
            int num = scan.nextInt();
            if (num < min){
                min = num;
            }
        }
        System.out.println("min = "+min);
    }
}
