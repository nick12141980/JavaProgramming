package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("13 Pro","6.7 inches",999,"Black");

        Samsung samsung = new Samsung("Galaxy S19","6 inches",900,"White");

        Nokia nokia = new Nokia("Brick","4 inches",50,"Blue");

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(nokia);

        iPhone.call(911);
        iPhone.text(123456);
        iPhone.faceTime(9876543);
        iPhone.faceTime("gmail@yahoo.com");

        System.out.println("--------------------");

        samsung.call(565436476);
        samsung.text(874687356);
        samsung.freeze();

        System.out.println("--------------------");

        nokia.call(293875);
        nokia.text(849876);
        nokia.selfDefence();

        System.out.println("--------------------");

        System.out.println(IPhone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);




    }


}
