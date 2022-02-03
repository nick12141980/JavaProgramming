package day44_Abstraction.animalTask;

public abstract class Animal {

    private String name, size;
    private final char gender;
    private final String breed, color;
    private int age;

    public final static boolean canBreathe = true;

    public Animal(String name, String size, char gender, String breed, String color, int age) {
        setName(name);
        setSize(size);
        if (!(gender == 'M' || gender == 'F')){
            throw new RuntimeException("Invalid gender")
        }
        this.gender = gender;
        this.breed = breed;
        this.color = color;
        setAge(age);
    }

    public void setName(String name) {
        if (name.isEmpty()){
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public char getGender() {
        return gender;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract void eat();

    public final void drink(){
        System.out.println(name+" drinks water");
    }
}
/*
Animal Task:
    Create an abstract class named Animal:
        Variables:
            name, breed(final), gender(final),  age, size, color(final)

        Encapsulate all the fields

        Add a constructor that can set all the fields

        Methods:
            eat() ==> different animals eat different foods
            drink() ==> all the animals drink water
            toString() ==> to display the full info of the animal

    Create the following subclasses of Animal:
            Dog
                eat(): eats Pizza

            Cat
                eat(): eats Biryani

            Tiger
                eat(): eats deer

            Parrot
                eat(): eats chocolate

            Eagle
                eat(): eats snake

 */