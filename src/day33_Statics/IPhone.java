package day33_Statics;

public class IPhone {

    public static String brand = "Apple";
    public String model;
    public double price;
    public static String oS = "iOS";
    public String color;
    public String size;
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean hasTouchScreen = true;

    //public void printModelAndPrice(){
    //    System.out.println(model+ " "+price); //static methods do not accept instances
    //}

    public void method1(){
        System.out.println(model+ " "+price);
        System.out.println(oS);
    }

    public static void printOS(){
        System.out.println(oS);
    }



}
