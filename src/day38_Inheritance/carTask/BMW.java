package day38_Inheritance.carTask;

public class BMW extends Car{
    public BMW( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }
    public void breaksDown(){
        System.out.println(make+" "+model+" breaks down");
    }
    public void racing(){
        System.out.println(make+" "+model+" is racing");
    }

    public void start(){
        System.out.println("Call a mechanic to start");
    }
}
