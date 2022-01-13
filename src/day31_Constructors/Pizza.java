package day31_Constructors;

public class Pizza {

    public char size;
    public  int numberOfCheese;
    public int numberOfPepperoni;

    public Pizza(char size, int numberOfCheese, int numberOfPepperoni) {
        this.size = size;
        this.numberOfCheese = numberOfCheese;
        this.numberOfPepperoni = numberOfPepperoni;
    }

    public double calculateCost(){
        double startingPrice = (size == 'S')? 10:(size == 'M')? 12: 14;
        double totalPrice = startingPrice + (numberOfCheese+numberOfPepperoni)*2;
        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheese=" + numberOfCheese +
                ", numberOfPepperoni=" + numberOfPepperoni +
                ", Total price=$" + calculateCost() +
                '}';
    }
}
/*
Pizza Task:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */