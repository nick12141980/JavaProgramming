package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        // (short)a

        int c = b; //implicit casting
        // int = (int)b

        long d = c;
        //  (long)c

        float e = d;
        double f = e;

        System.out.println("-----------------");

        int x =55;
        short y = (short)x;

        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short)j;

        System.out.println(j + " : " + k);

        double l = 2.5;
        float m = (float)l;
        System.out.println(l+" : "+m);

        double n = 10.8;
        int s = (int)n;
        System.out.println(n+" : "+s);

        System.out.println("------------------");

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1+" : "+s1);

        float f1 =30.5f;
        long l1 = (long) f1;
        System.out.println(f1+" : " +l1);

        //int a =5;
        //byte b = a;
        //System.out.println(b);
        int num = -5;
        //System.out.println(num++ + ", ");
        //System.out.println(num = 0);
        //System.out.println(", " + --num);

        //short t = 13-9/3*10;
        //t += -10;
        //System.out.println(t);

        //int ab = 10;
        //ab = --ab + ab++ + ab-- + ab++;
        //System.out.println(ab);
/*
        String str ="";
        int num1 = 20;
        switch (num1){
            case 0:
                str = "C#";
                break;
            case 10:
                str += "fun";
            case 15:
                str = "fun";
            case 20:
                str += "java";
            case 25:
                str +="is ";
                break;
            case 30:
                str += "fun";
                break;
            case 35:
                str = "python";
            case 40:
                str +="90";

        }
        System.out.println(str);
*/
        //double decimal = 13.142;
        //int whole = decimal < 20 ? 20 : 10;

        //System.out.println(whole);

        int check = 132;
        String str = "";

        if(check%2 == 0){
            str +=check;
            if(check%5 ==0){
                str += "132";
            }else{
                str = "500";
            }
        }else{
            str = "123";
        }
        System.out.println(str);



    }
}
