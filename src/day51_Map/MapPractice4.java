package day51_Map;

import java.util.*;

public class MapPractice4 {

    public static void main(String[] args) {

        /*
        String[] group1 = {"A","B", "C", "D"};
        String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String[] group3 = {"Andrii", "Azizozen", "MaryJo", "Mungun", "Neira", "Sultan", "Tahmina", "Yulya", "Munu", "Yunus"};
        String[] group4 = {"Natalia", "Palina", "David". "Tariq", "Rabia", "Muhammet"};
        String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};
        */
        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("A","B", "C", "D"));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList("Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"));
        ArrayList<String> group3 = new ArrayList<>(Arrays.asList("Andrii", "Azizozen", "MaryJo", "Mungun", "Neira", "Sultan", "Tahmina", "Yulya", "Munu", "Yunus"));
        ArrayList<String> group4 = new ArrayList<>(Arrays.asList("Natalia", "Palina", "David", "Tariq", "Rabia", "Muhammet"));
        ArrayList<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"));

        Map<Integer, ArrayList<String>> groups = new TreeMap<>();

        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(3, group3);
        groups.put(4, group4);
        groups.put(5, group5);
        System.out.println( groups.get(4) );

        for (String each : groups.get(2)) {
            System.out.println(each);
        }
        System.out.println(groups.get(1).get(3));

    }
}
