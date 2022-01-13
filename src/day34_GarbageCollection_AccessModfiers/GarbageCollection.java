package day34_GarbageCollection_AccessModfiers;


import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        String str = null;
        str = "";
        System.out.println(str.toUpperCase());

        String str1 = "Wooden Spoon"; //after this line "Wooden Spoon" will be eligible for garbage collection

        str1 = null;

        System.out.println(str1);

        Car car1 = new Car("Toyota");
        car1 = null;
        System.out.println(car1);

        System.out.println("-------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1 = new Dog();
        dog1.name = "Max";

        System.out.println(dog1);

        String language = "Python";
               language =  "Java";

        System.out.println(language);

        System.out.println("-------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);


        System.out.println("-------------------------------");

        Student student1 = new Student("Tahir",30,'M','B',123);
        Student student2 = student1;
        student1.name = "Ahmet";
        student1.grade = 'A';

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("-------------------------------");
        
        ArrayList<String>  l1 = new ArrayList<>();
        ArrayList<String>  l2 = new ArrayList<>();

        l1.add("Java");

       // ArrayList<String> l2 = l1;
        l2.add("Python");

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
    }
}
