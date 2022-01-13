package day38_Inheritance.carTask;

public class Car {

    public String make;
    public String model;
    public int year;
    public double price;
    public String color;
    public int miles;

    public Car(String make, String model, int year, double price, String color, int miles) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public void start(){
        System.out.println(make+" "+model+" is starting");
    }

    public void drive(){
        System.out.println(make+" "+model+" is moving");
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=$" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}
