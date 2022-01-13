package day31_Constructors.srumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;
    public ArrayList<Tester> testerList = new ArrayList<>();
    public ArrayList<Developer> devList = new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester){
        testerList.add(tester);
    }

    public void addTesters(Tester[] testers){
        testerList.addAll(Arrays.asList(testers));
    }

    public void addDev(Developer developer){
        devList.add(developer);
    }

    public void addDevs(Developer[] developers){
        devList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int id){
        testerList.removeIf(p -> p.id == id);
    }

    public void removeDev(int id){
        devList.removeIf(p -> p.id == id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testerList.size() +
                ", total number of developers=" + devList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
