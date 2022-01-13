package day07_Operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        //assignment: =
        int number = 100;
        System.out.println("number = " + number); //100
        number = 200;
        System.out.println("number = " + number); //200

        String word = "Java Programming";
        System.out.println("word = " + word); //Java Programming
        word = "Wooden Motorcycle";
        System.out.println("word = " + word); //Wooden Motorcycle
        word = "Cydeo";
        System.out.println("word = " + word);
        word = "Java Programming";
        System.out.println("word = " + word);

        System.out.println("-----------------------");

        //Addition Assignment

        int x = 100;
        System.out.println("x = " + x);
        System.out.println(x + 200); //300
        //x = x + 200;
        x+= 200;
        System.out.println("x = " + x); //300
        
        String str = "Wooden";
        str+= " Motorcycle";
        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1); //2.5
        num1+=5.5;
        System.out.println("num1 = " + num1);// 8.0

        double availableBalance = 1000.50;
        //deposit $300
        availableBalance+= 300;
        System.out.println("availableBalance = " + availableBalance);//1300.5

        System.out.println("----------------------------");
        
        // withdrawing $500
        
        availableBalance-= 500;
        System.out.println("availableBalance = " + availableBalance);//800.5

        // withdraw $200 then deposit $400

        availableBalance-= 200; //600.5
        availableBalance+= 400; //1000.5

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("--------------------------");

        // Multiplication Assignment

        double salary = 50000.5;
        System.out.println("salary = " + salary);
        salary*= 2;
        System.out.println("salary = " + salary);

        double doge = 0.0000001;
        doge*= 100000000;
        System.out.println("doge = " + doge);

        System.out.println("---------------------------");
        
        double num2 = 25000;
        num2/= 2;
        System.out.println("num2 = " + num2);

        System.out.println("-----------------------------");

        //Remainder Assignment

        double num3 = 100;

        // %/=
        num3%= 3; //1
        System.out.println("num3 = " + num3);

        int amount = 127; //cents
        int quarters = amount/25;
        int pennies = amount%25;

        System.out.println("quarters = " + quarters);
        System.out.println("pennies = " + pennies);

        System.out.println("----------------------");

        int pennies2 = 127;
        pennies2 %= 25;
        System.out.println("pennies2 = " + pennies2);

        int y = 300;
        y%= 16;
        System.out.println("y = " + y);

        System.out.println("----------------------");

        int balance = 3500;

        //insurance $153

        balance%= 153;
        System.out.println("balance = " + balance);









    }
}
