package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setInfo("BMW","M5","White",2021,95245);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("Ford","Bronco","Black",2022,51600);

        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Audi","Q7","Silver",2019,37000);

        System.out.println(car3);

        //Car[] cars = {car1,car2,car3};

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each : carList) {
            System.out.println( each.brand+" "+each.price );
        }

        System.out.println("--------------------------");

        /*
        BMW: 2005 - 2008
        Toyota: 1995 - 1997
         */

        carList.removeIf(p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008);
        carList.removeIf(p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);


    }
}
