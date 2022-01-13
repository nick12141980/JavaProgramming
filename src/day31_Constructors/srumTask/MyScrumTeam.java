package day31_Constructors.srumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        //4 testers objects
        Tester tester1 = new Tester("Layan",123,"QA",120000);
        Tester tester2 = new Tester("Ali",124,"QA",110000);
        Tester tester3 = new Tester("Alex",125,"QA",125000);
        Tester tester4 = new Tester("Lala",126,"QA",120000);

        Tester[] testers ={tester2,tester3,tester4};

        //4 devs objects
        Developer developer1 = new Developer("Olga",11,"Java Dev",150000);
        Developer developer2 = new Developer("Nick",12,"Java Master",180000);
        Developer developer3 = new Developer("Aygun",13,"Java Dev",140000);
        Developer developer4 = new Developer("Sinem",14,"Java Dev",160000);

        Developer[] developers ={developer2,developer3,developer4};

        // 1 Scrum Team object
        ScrumTeam scrumTeam = new ScrumTeam("Alex","Hussein","Neira",14);
        scrumTeam.addTester(tester1);
        scrumTeam.addDev(developer1);

        scrumTeam.addTesters(testers);
        scrumTeam.addDevs(developers);

        System.out.println(scrumTeam);

        System.out.println("------------------------------------------------------------------");

        for(Tester each:scrumTeam.testerList){
            System.out.println(each.name+" "+ each.salary);

        }
        System.out.println("------------------------------------------------------------------");
        for (Developer each: scrumTeam.devList){
            System.out.println(each.name+" "+each.salary);
        }

        scrumTeam.removeTester(125);

        System.out.println(scrumTeam);

        scrumTeam.removeDev(12);

        System.out.println(scrumTeam);



    }



}
