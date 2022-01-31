package day43_Abstraction.car;

public class Car {

    private final String make ,model;
    private String color;
    private int year;
    private final double price;

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        if(year<1886){
            throw new RuntimeException("Invalid year: "+year);
        }
        setColor();
        setYear();
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

    public void setYear(int year) {
        this.year = year;
    }
}
