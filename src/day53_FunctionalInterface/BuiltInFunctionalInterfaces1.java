package day53_FunctionalInterface;

import java.util.function.Predicate;

public class BuiltInFunctionalInterfaces1 {

    public static void main(String[] args) {

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);

        };
        boolean result = isPalindrome.test("level");
        System.out.println(result);

    }
}
