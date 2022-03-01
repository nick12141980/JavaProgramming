package day51_Map;

import java.util.*;

public class MapIteration {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();

        students.put("Aygun", 85);
        students.put("Maria", 86);
        students.put("Ali",86);
        students.put("Alex",96);
        students.put("Ozan",99);
/*
        Set<String> keys = students.keySet();

        for(String eachKey : keys){
            students.replace(eachKey, students.get(eachKey)+5);
        }
*/
        //remove students with score less tha 90
        for (String eachKey : students.keySet()) {
            Integer eachValue = students.get(eachKey);
            if (eachValue < 90){
                System.out.println(eachKey);
            }
        }
        System.out.println(students);

        Map<String, Integer> earlyBirds = new HashMap<>();// score >= 90
        Map<String, Integer> angryBirds = new HashMap<>(); //score < 90

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if (value >= 90){
                earlyBirds.put(key, value);
            }else {
                angryBirds.put(key, value);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        Set<String> names = students.keySet();

        System.out.println(names);

        //Collection<Integer> scores =students.values();
        List<Integer> scores = new ArrayList<>( students.values() );

        System.out.println(scores);

        for (Integer value : students.values()) {
            System.out.print(value+" ");
        }

        System.out.println();
        System.out.println("----------------------------------");

        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer score : students.values()) {
            if (score>maxScore){
                maxScore = score;
            }
            if (score < minScore){
                minScore = score;
            }
        }
        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);

        int max = Collections.max( students.values() );
        int min = Collections.min( students.values() );

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("----------------------------------");

        int number = 0;
        for (Integer score : students.values()) {
            if(score > 90){
                number++;
            }
        }

        System.out.println(number);



        
        
    }
}
