package day16_ForLoop_String;

public class Duplicates {

    public static void main(String[] args) {

        String str = "aabbccaaa";
        //abc
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = ""+str.charAt(i); //represents each char of str

            if (!result.contains(ch)){
                result += ch;
            }


        }
        System.out.println(result);


    }
}
