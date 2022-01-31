package day43_Abstraction.employeeTask;

public final class Tester extends Employee{


    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is testing");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps for 12 hours");
    }

    public void bugReport(){
        System.out.println(getName()+" is writing bug report");
    }
}
