package day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(String str){
        this(9);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls obj2 = new ConstructorCalls(1);
        ConstructorCalls obj3 = new ConstructorCalls("Java");
    }


}
