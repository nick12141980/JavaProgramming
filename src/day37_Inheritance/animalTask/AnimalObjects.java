package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Max","Husky",'M',3,'M',"White");

        System.out.println(dog1);

        Cat cat1 = new Cat("Tom","Siamese",'M',3,'S',"Grey");

        Parrot parrot1 = new Parrot("Parrot","Macaw",'F',1,'S',"Multicolor");

        System.out.println(cat1);
        System.out.println(parrot1);
        parrot1.sing();


    }


}
