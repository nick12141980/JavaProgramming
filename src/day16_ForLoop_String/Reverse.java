package day16_ForLoop_String;

public class Reverse {

    public static void main(String[] args) {

        String str = "tnuc kcuf tihs";
        String result =""; // will contain reverse version of str

        //result += str.charAt(str.length()-1);//n
        //result += str.charAt(10);//o
        //no

        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }

        System.out.println(result.toUpperCase());


    }
}
