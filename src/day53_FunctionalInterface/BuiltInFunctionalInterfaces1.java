package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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



    }
}
