package day24_CustomMethod_Return;

public class ReturnMethodsPractice3 {

    public static void main(String[] args) {

        String str = "aavvvbccde";

        for (int i = 0; i < str.length(); i++) {
            int freq = frequency(str,str.charAt(i));
            if(freq==1){
                System.out.println(str.charAt(i));
            }
        }


    }

    public static int frequency(String str,char ch){
        int count = 0;
        for(char each:str.toCharArray()){
            if(each==ch){
                count++;
            }
        }
        return count;
    }

}
