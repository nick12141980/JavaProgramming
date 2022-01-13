package day34_GarbageCollection_AccessModfiers;

public class AccessModifiers {

    public static int publicData = 100;
    static int defaultData = 200; //default access modifier
    private static int privateData = 300;

    public static void method1(){
        System.out.println("Public");
    }
    static void method2(){
        System.out.println("Default");
    }
    private void method3(){
        System.out.println("Private");
    }
    public static void main(String[] args) {

        System.out.println("publicData = " + publicData);
        System.out.println("defaultData = " + defaultData);
        System.out.println("privateData = " + privateData);


    }


}
