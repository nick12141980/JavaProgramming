package day18_NestedLoop;

public class Alphabet {

    public static void main(String[] args) {

        for(char i = 'A';i<='E';i++ ){
           for(char j = 'a';j <= 'z'; j++){
               System.out.print(""+i+j+" ");
           }
            System.out.println();
        }
    }
}
