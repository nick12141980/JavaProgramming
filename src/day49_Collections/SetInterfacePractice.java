package day49_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println(hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        Set<Integer> treeSet = new TreeSet<>();


    }
}
