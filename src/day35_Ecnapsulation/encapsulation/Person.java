package day35_Ecnapsulation.encapsulation;

public class Person {

    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age < 16 || age > 90){
            System.err.println("Invalid age "+ age);
            System.exit(0);
        }
        this.age = age;
    }



}
