package day46_Polymorphism;

import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;
import org.w3c.dom.ls.LSOutput;

public class PolymorphismIntro {

    String str = "Wooden Spoon";

    Integer n1 = 2;

    Double b2 = 5.5;

    Boolean r1 =true;

    Object[] = {str, n1, b2, r1, new Circle(4), new Square(5)};

    public static void main(String[] args) {


        Shape shape = new Circle(4);
        System.out.println(shape instanceof Square);
    }






}
