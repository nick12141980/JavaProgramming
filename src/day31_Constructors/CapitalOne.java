package day31_Constructors;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setInfo("Ahmet",1111222456);

        System.out.println(bankAccount1);

        bankAccount1.deposit(50000);
        bankAccount1.checkBalance();
        bankAccount1.withdraw(500);
        bankAccount1.checkBalance();

        System.out.println("-----------------------------------------------");

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.setInfo("Aygun",123456);
        bankAccount2.deposit(1000);
        bankAccount2.checkBalance();




    }
}
