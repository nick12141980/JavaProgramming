package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

       // Car car = new Car("Cydeo","Batch25","White",2022,100000);
        //no object can be created from abstract class

        Honda honda = new Honda("Pilot","Black",2020,29000);

        Audi audi = new Audi("S8","Silver",2022,160000);

        Tesla tesla = new Tesla("Model Y","white",2021,45000);

        honda.setColor("White");
        audi.setPrice(159000);

        tesla.start();

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

    }
}
