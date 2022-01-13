package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Cooper","pit-bull",'M',5,'M',"Brown");
        dog.sleep();
        dog.eat();
        dog.drink();
        dog.bark();
        System.out.println(dog);
        Cat cat = new Cat();
        cat.setInfo("Tiger","American Shorthair",'M',4,'S',"Brown");
        System.out.println(cat);
        cat.eat();
        cat.meow();
        cat.sleep();

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',7,'L',"Orange");
        System.out.println(tiger);
        tiger.roar();
        tiger.drink();





    }


}
