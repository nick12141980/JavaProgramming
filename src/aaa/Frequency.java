package aaa;

public class Frequency {

    public static String frequency(String str, char ch){

        int count = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                count++;
                result += str.charAt(i)+"";

            }
        }

        return result+count;

    }

    public static void main(String[] args) {

       String r =  frequency("aaabbbccc",'a');
        System.out.println(r);
    }

}