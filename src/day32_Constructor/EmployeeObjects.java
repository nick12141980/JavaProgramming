package day32_Constructor;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Nick");
        Employee employee2 = new Employee("Bob",'M');
        Employee employee3 = new Employee("Olga",'F',"SDET");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);


    }
}
