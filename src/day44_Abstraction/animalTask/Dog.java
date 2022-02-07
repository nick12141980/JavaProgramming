package day44_Abstraction.animalTask;

public class Dog extends Animal implements Playable{

    public Dog(String name, String size, char gender, String breed, String color, int age) {
        super(name, size, gender, breed, color, age);
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats pizza");
    }


    @Override
    public void play() {
        System.out.println(getName()+" is playing");
    }
}
