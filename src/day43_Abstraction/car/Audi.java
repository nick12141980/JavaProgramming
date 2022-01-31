package day43_Abstraction.car;

public final class Audi extends Car{

    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    public void start(){
        System.out.println("Press engine start button");
    }

    public void autoPark(){
        System.out.println(getMake()+" "+"has auto park feature");
    }
}
