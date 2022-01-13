package day17_WhileDoWhileLoop;

public class FreqOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Java Java python";
        int freq = 0;

        while (str.contains("Java")){
            str = str.replaceFirst("Java","");
            freq++;
        }
        System.out.println(freq);

        System.out.println("-------------------------");

        String sentence  = "cat cat cat cat cat dog";
        int count = 0;

        while (sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat","");
            count++;
        }
        System.out.println(count);

        String s = "java java python python python";

        int countJava = 0;
        int countPython = 0;

        while (s.contains("java") || s.contains("python")){

            if(s.contains("java")){
                s = s.replaceFirst("java","");
                countJava++;
            }

            if(s.contains("python")){
                s=s.replaceFirst("python","");
                countPython++;
            }
        }
        System.out.println(countJava);
        System.out.println(countPython);

    }
}
