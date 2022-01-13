package day30_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {

        Employees employee1 = new Employees();
        Employees employee2 = new Employees();
        Employees employee3 = new Employees();
        Employees employee4 = new Employees();
        Employees employee5 = new Employees();

        employee1.setInfo("John",'M',25,14356,"Dev",100000,true);
        employee2.setInfo("Anna",'F',22,14356,"QA",102000,true);
        employee3.setInfo("David",'M',25,14356,"Dev",1000300,false);
        employee4.setInfo("Lina",'M',33,14356,"QA",1002000,true);
        employee5.setInfo("Kevin",'M',40,14356,"Dev",1000400,true);

        Employees[] employees = {employee1,employee2,employee3,employee4,employee5};

        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;

        for (Employees employee : employees) {
            if(employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }
        }

        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);

    }


}
