package day52_Map_FunctionalInterface;

//Lambda: () -> {}

public class Test {

    public static void main(String[] args) {

        //function1: create a function that displays if the number is odd or even
        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if (n%2==0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        };
        oddOrEvenNumber.apply(20);

        //function2: eligibility to buy alcohol
        MyFirstFunctionalInterface eligibleToBuyAlcohol = (age) -> {
            if (age>=21){
                System.out.println("Eligible");
            }else{
                System.out.println("Not eligible");
            }
        };
            eligibleToBuyAlcohol.apply(22);

        //function3: display the cube of a number
        MyFirstFunctionalInterface printCube = (n) ->  {
            System.out.println(n*n*n);
        };

        printCube.apply(3);



    }

}
