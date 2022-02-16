package day47_Polymorphism;

public class InheritanceReview {

    public InheritanceReview(int a){
        System.out.println("Parent class constructor");
    }

    int a;
    void method1(){

    }

}

class A extends InheritanceReview{

    public A(int a) {
        super(a);
    }
}

class B  extends InheritanceReview{

    public B(int a) {
        super(a);
    }
}

class C extends  InheritanceReview{

    public C(int a) {
        super(a);
    }
}

class Aa extends A{

    public Aa(int a) {
        super(a);
    }
}