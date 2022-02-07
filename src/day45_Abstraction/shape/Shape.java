package day45_Abstraction.shape;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                " ,area='" + area() + '\'' +
                " ,perimeter='" + perimeter() + '\'' +
                '}';
    }

    public abstract double area();

    public abstract double perimeter();
}
