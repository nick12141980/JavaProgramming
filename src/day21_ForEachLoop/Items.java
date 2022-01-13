package day21_ForEachLoop;

public class Items {

    public static void main(String[] args) {


        String[] items = {"Shoes", "Jacket","Gloves","Airpods","iPad"};
        double[] prices = {99.99,  150.9,     9.99,     250.0,    499.0};
        int[] itemID =   {12345 ,  45646,     47867,   7635,      89068};

        for (int i = 0; i < items.length; i++) {
         String item = items[i];
         double price = prices[i];
         int id = itemID[i];

            System.out.println(item+" - "+id+" - $"+price);
        }


    }
}
