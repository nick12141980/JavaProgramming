package day47_Polymorphism;

import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Shape;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Shape shape = new Circle(4); //upcasting

        Animal animal = new Dog("Max", "M",'M',"Husky","White",4);

        Dog dog = (Dog) animal; //downcasting
        ((Dog)animal).bark();

        System.out.println(animal.getName());
        System.out.println(dog.getName());

        dog.bark();


    }
}
