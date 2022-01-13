package day04_Variables;

public class Rectangle {

    public static void main(String[] args) {

        //length, width, area, perimeter

        double length = 25;
        double width = 35;
        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}

/*
                        area = length * width
                        perimeter =  2 * (length + width)
 */