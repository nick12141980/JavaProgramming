package day44_Abstraction.animalTask;

public class Parrot extends Animal implements Playable{

    public Parrot(String name, String size, char gender, String breed, String color, int age) {
        super(name, size, gender, breed, color, age);
    }

    public void talk(){
        System.out.println(getName()+" is talking");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats chocolate");
    }

    public void play() {
        System.out.println(getName()+" is playing");
    }
}
