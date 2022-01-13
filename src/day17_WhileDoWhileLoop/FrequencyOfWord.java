package day17_WhileDoWhileLoop;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = "JavaJavaJava";
        String subStr = "";
        int count = 0;

        for (int i = 0; i <= str.length()-4; i++) {

            subStr = str.substring( i, i+4 );

            if (subStr.equals("Java")){
                count += 1;
            }

        }
        System.out.println(count);
    }
}
