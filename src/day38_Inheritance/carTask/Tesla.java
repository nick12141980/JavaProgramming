package day38_Inheritance.carTask;

public class Tesla extends Car{
    public Tesla( String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }
    public void autoPilot(){
        System.out.println(make+" "+model+" is self driving");
    }

    public void start(){
        System.out.println("Shift to drive to start moving");
    }
}
