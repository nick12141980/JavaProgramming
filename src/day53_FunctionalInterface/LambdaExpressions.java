package day53_FunctionalInterface;

public class LambdaExpressions {

    public static void main(String[] args) {

        MyThirdFunctionalInterface<String> stringReverse = (s) -> {
            String reverse = new StringBuilder().reverse().toString();
            return reverse;
        };

        String result = stringReverse.method("Wooden Spoon");
        System.out.println(result);

    }

}
