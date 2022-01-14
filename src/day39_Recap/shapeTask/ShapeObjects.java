package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(11);
        System.out.println(square);

        square.setSide(20);
        System.out.println(square);

        System.out.println("-----------------------------");

        Rectangle rectangle = new Rectangle(10,20);
        rectangle.setWidth(10);
        rectangle.setLength(30);
        System.out.println(rectangle);
        System.out.println(rectangle.getLength());

        System.out.println(rectangle.getName());

        System.out.println("-------------------------------");

        Circle circle = new Circle(11);
        System.out.println(circle);



    }
}
