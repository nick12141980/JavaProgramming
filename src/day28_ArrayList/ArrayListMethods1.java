package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //3
        numbers.add(30); //5
        numbers.add(40); //6

        numbers.add(2,25); //2
        numbers.add(4,35); //4

        System.out.println(numbers);

        System.out.println(numbers.size());

        int lastIndex = numbers.size()-1;
        System.out.println(lastIndex);

        int num = numbers.get(3);

        System.out.println(num);

        System.out.println("-----------------------");


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-----------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Ruby");
        list.add("Java");

        list.set(2,"Java Script");
        list.set(3,"C++");

        System.out.println(list);

        System.out.println("-------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(1);

        System.out.println(employees);

        employees.remove(employees.size()-1);

        System.out.println(employees);

        boolean r1 = employees.remove("Hulya");

        System.out.println(employees);
        System.out.println(r1);






    }









}
