package day20_Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Java","Java","Python","Python","C#"};

        for (int j = 0; j < words.length; j++) {
            String element = words[j];
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element)){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(element);
            }
        }




    }
}
