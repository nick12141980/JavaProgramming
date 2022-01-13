package day32_Constructor;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda","Accord");
        Car car3 = new Car("Lexus","RX",2020);
        Car car4 = new Car("BMW","X7",2021,90000);
        Car car5 = new Car("Volvo","850",1995,2000,"White");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);


    }
}
