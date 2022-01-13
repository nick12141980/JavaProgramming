package day34_GarbageCollection_AccessModfiers;

public class StaticMembers {
    int a;

    static class Class1{

    }

    public static int num = 100;

    public static void method(){

    }

    static {

    }


}
 class A{

    static class B{

        public static void method1(){

        }

    }

}

class C{
    public static void main(String[] args) {
        A.B.method1();
    }
}



class X{

}

class Y{

}

class Z{
    static class Q{

    }
}
