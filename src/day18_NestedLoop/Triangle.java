package day18_NestedLoop;

public class Triangle {

    public static void main(String[] args) {

        for(int j = 1; j<=10; j++){

            for (int i = 1; i < j +1; i++) {

                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
