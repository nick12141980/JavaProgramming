package day04_Variables;

public class Cricle {

    public static void main(String[] args) {


        double radius = 10;

        double PI = 3.14;
        double diameter = 2 * radius; // finds diameter
        double area = radius * radius * PI; //finds area
        double perimeter = 2 * radius * PI; // finds perimeter

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
