package day31_Constructors.srumTask;

public class Tester {

    public String name;
    public int id;
    public String jobTitle;
    public double salary;

    public Tester(String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+" is doing smoke testing");
    }

    public void createTicket(){
        System.out.println(name+" is creating a ticket");
    }



}
