package day19_LoopPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcceffgh";
        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;//represents frequency of ch

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i); // each char of string
                if (ch == each){
                    count++;
                }
            }
            if (count == 1){
                 result  += ch;
            }

        }
        System.out.println(result);







    }
}
