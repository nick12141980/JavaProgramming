package day31_Constructors.srumTask;

public class Developer {

    public String name;
    public int id;
    public String jobTitle;
    public double salary;

    public Developer(String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name+ " is coding");
    }

    public void unitTesting(){
        System.out.println(name+ " is unit testing");
    }

    public void bugFixing(){
        System.out.println(name+ " is fixing bugs");
    }


}
