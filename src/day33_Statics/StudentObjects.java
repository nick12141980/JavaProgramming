package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Nick");

        System.out.println(student1);

        Student student2 = new Student("Aygun",'F');
        Student student3 = new Student("Nigara",'F',23);
        Student student4 = new Student("Anthony",'M',10,123);
        Student student5 = new Student("Muhtar",'M',30,345,'A');

        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);

        Student[] students = {student1,student2,student3,student4,student5};

        System.out.println(Arrays.toString(students));


    }
}
