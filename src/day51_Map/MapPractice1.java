package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        //  1. Update the "M" to Male and "F" to Female
 /*       for (String key : employeeMap.keySet()) {
            if (employeeMap.get(key).equals("M")){
                employeeMap.replace(key, "Male");
            }
            if (employeeMap.get(key).equals("F")){
                employeeMap.replace(key, "Female");
            }
        }
        */

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals("M")){
                entry.setValue("Male");
            }
            if (entry.getValue().equals("F")){
                entry.setValue("Female");
            }
            System.out.println(entry);
        }
        System.out.println("-----------------------------------------");

        //  2. Display the names of all female employees
        for (Map.Entry<String, String> pair : employeeMap.entrySet()) {
            System.out.println(pair);
            String eachKey = pair.getKey();
            String eachValue = pair.getValue();

            if (eachValue.equals("Female")){
                System.out.println(eachKey);
            }
        }


    }
}
