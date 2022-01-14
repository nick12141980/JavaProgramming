package day39_Recap.shapeTask;

public class Rectangle extends Shape{

    public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <= 0){
            System.err.println("Invalid length");
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            System.err.println("Invalid width");
            System.exit(1);
        }
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
