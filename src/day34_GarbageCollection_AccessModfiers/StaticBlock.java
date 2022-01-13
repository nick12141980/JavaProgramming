package day34_GarbageCollection_AccessModfiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main Method");

    }

    static{ //runs before anything and only runs one time

        System.out.println("Static Block");

    }



}
