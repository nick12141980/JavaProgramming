package day35_Ecnapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tatyana",'F',30,12000);


        employee1.setAge(32);

        System.out.println(employee1);

        Employee employee2 = new Employee("Aygun",'F',31,130000);

        employee2.setSalary(employee2.getSalary() + 15000);

        System.out.println(employee2);
    }







}
