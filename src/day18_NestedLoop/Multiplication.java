package day18_NestedLoop;

public class Multiplication {

    public static void main(String[] args) {

for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");

            for (int j = i*2 ; j <= i*10; ) {

                System.out.print(j + " ");
                j+=i;
            }
            System.out.println();
        }

        /*
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print(i*j+"         ");
            }
            System.out.println();
        }

         */
    }
}
