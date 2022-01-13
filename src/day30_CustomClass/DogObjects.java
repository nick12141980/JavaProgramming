package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

       Dog dog1 = new Dog();
       dog1.name = "Cooper";
       dog1.breed = "Pit-bull";
       dog1.age = 5;
       dog1.gender = 'M';
       dog1.size = "Medium";
       dog1.color = "White";

       Dog dog2 = new Dog();
       dog2.name = "Ace";
       dog2.breed = "Husky";
       dog2.age = 3;
       dog2.gender = 'M';
       dog2.size = "Large";
       dog2.color = "Grey";

        Dog dog3 = new Dog();
        dog3.setInfo("Lucky","Chow Chow",4,'M',"Medium","Brown");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

        System.out.println("-----------------------------------------------");

        Dog dog4 = new Dog();
        Dog dog5 = new Dog();

        dog4.setInfo("Muhtar","German Shepard",3,'M',"Large","Brown");
        dog5.setInfo("Lucy","Chihuahua",5,'F',"Small","Black");

        Dog[] dogs = {dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();

    }


}
