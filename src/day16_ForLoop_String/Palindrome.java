package day16_ForLoop_String;

public class Palindrome {

    public static void main(String[] args) {

        String str = "level";
        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }
        if (str.equalsIgnoreCase(result)) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }



    }
}
