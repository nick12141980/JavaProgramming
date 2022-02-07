package day45_Abstraction.shape;

public class Cube extends Shape implements Volume{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Cube(double side) {
        super("Cube");
        setSide(side);
    }

    @Override
    public double area() {
        return side*side*4;
    }

    @Override
    public double perimeter() {
        return side*6;
    }

    @Override
    public double Volume() {
        return side*side*side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                super.toString()+
                "side=" + side +
                '}';
    }
}
