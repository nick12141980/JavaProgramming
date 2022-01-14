package day39_Recap.shapeTask;

public class Rectangle extends Shape{

    public Rectangle(String name, double length, double width) {
        super(name);
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
}
