package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static {
        name = "Nick";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;
        final  String name;
        name = "Java";

        System.out.println("-----------------------");

        FinalVariable obj = new FinalVariable("Dec 14th");

        System.out.println(obj.birthDay);

       // obj.birthDay = "  ";

        System.out.println(FinalVariable.name);



    }
}
