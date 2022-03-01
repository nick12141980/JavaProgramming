package day51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        //Student name and score

        Map<String, Integer> students = new HashMap<>();

        students.put("Aygun", 85);
        students.put("Maria", 86);
        students.put("Ali",86);
        students.put("Alex",96);
        students.put("Ozan",99);

        System.out.println(students);
        System.out.println(students.size());

        //display score of Alex

        System.out.println(students.get("Alex"));

        //replace Ali's score to 90

        students.replace("Ali",90);

        students.remove("Alex");

        System.out.println("students.containsKey(\"Ozan\") = " + students.containsKey("Ozan"));

        System.out.println("students.containsValue(99) = " + students.containsValue(99));

        System.out.println("-----------------------------------");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);
        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1.equals(map2));





    }
}
