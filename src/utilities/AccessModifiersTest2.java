package utilities;

import day34_GarbageCollection_AccessModfiers.AccessModifiers;

public class AccessModifiersTest2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
      //  System.out.println(AccessModifiers.defaultData);//not visible outside th package
       // System.out.println(AccessModifiers.privateData); //not visible outside the class

        AccessModifiers.method1();
       // AccessModifiers.method2();
        //AccessModifiers.method3();



    }
}
