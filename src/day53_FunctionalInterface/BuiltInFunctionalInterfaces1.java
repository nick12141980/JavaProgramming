package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltInFunctionalInterfaces1 {

    public static void main(String[] args) {

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);

        };
        boolean result = isPalindrome.test("level");
        System.out.println(result);

        Predicate<Integer> isEven = p -> p%2==0;

        System.out.println("-----------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4));
        list.removeIf(isEven);
        System.out.println(list);

        System.out.println("------------------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));

        names.removeIf(isPalindrome);

        System.out.println(names);

        System.out.println("------------------------------------------");

        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };

        printEach.accept("Wooden Spoon");

        System.out.println("------------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,34,5,6,7,8,9,0));
      //  for (Integer each : list2) {
       //     if (each%2 != 0){
         //      System.out.println(each);
          //  }

        list2.forEach(p -> {if (p%2 != 0) System.out.println(p);});

        System.out.println("------------------------------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah",
                "Jilili Jiwuer", "Ali Ismayilov"));

        employees.forEach( s -> System.out.println(s.charAt(0)+"."+s.charAt(s.lastIndexOf(" ")+1 ) ));

        System.out.println("-------------------------------------------");

        Function<int[], List<Integer>> convertToList = (a) -> {
            List<Integer> result1 = new ArrayList<>();
            for(int each : a){
                result1.add(each);
            }
            return result1;
        };

        int[] arr = {1,2,3,4,5,6,7,8,3,4,6};
        List<Integer> l = convertToList.apply(arr);
        System.out.println(l);

        System.out.println("-------------------------------------------");

        Function<List<Integer>, int[]> convertToArray = (a) -> {

        };



    }
}
