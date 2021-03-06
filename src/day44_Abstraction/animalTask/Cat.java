package day44_Abstraction.animalTask;

public class Cat extends Animal implements Playable{

    public Cat(String name, String size, char gender, String breed, String color, int age) {
        super(name, size, gender, breed, color, age);
    }

    public void meow(){
        System.out.println(getName()+ "is meowing");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats bryani");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing");
    }
}
