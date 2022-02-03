package day44_Abstraction.animalTask;

public class Tiger extends Animal{

    public Tiger(String name, String size, char gender, String breed, String color, int age) {
        super(name, size, gender, breed, color, age);
    }

    public void roar(){
        System.out.println(getName()+" is roaring");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats deer");
    }
}
