package day16_ForLoop_String;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabbccnnkdds";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            String ch = ""+str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)){

                result += ch;
            }

        }
        System.out.println(result);
    }
}
