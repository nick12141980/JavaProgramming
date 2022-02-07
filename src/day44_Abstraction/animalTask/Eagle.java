package day44_Abstraction.animalTask;

public class Eagle extends Animal{

    public Eagle(String name, String size, char gender, String breed, String color, int age) {
        super(name, size, gender, breed, color, age);
    }

    public void fly(){
        System.out.println(getName()+" is flying");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats snakes");
    }
}