package day43_Abstraction.car;

public abstract class Car {

    private final String make ,model;
    private String color;
    private final int year;
    private double price;

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;

        if(year<1886){
            throw new RuntimeException("Invalid year: "+year);
        }
        this.year = year;
        setColor();
        if(price<=0){
            throw new RuntimeException("Invalid price: "+price);
        }
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=$" + price +
                '}';
    }

    public void stop(){
        System.out.println("Press the brake");
    }

    public abstract void start();




}
