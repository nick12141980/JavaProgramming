package day37_Inheritance.phoneTask;

public class Nokia extends Phone {

    public Nokia( String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefence(){
        System.out.println(brand+" "+model+" is a self defence tool");
    }


}
