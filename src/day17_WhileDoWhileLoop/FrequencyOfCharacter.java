package day17_WhileDoWhileLoop;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "AAAABBCA";
        char ch = 'A';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == ch){
                count++;
            }

        }
        System.out.println(count);

    }
}
