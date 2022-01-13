package day10_NestedIf;

public class FieldTrip {

    public static void main(String[] args) {

        int grade = 3;
        String location = "";
        int groupNumber = 0;
        String nameOfTeacher = "";

        if (grade>=1 && grade<=6){

            if (grade==1){
                /*
                System.out.println("Apple Orchard");
                System.out.println("3 groups");
                System.out.println("Ms Smith");
                */
                location = "Apple Orchrad";
                groupNumber = 3;
                nameOfTeacher = "Ms Smith";
            }else if(grade == 2){
                location = "Zoo";
                groupNumber = 7;
                nameOfTeacher = "Mr Lee";
            }else if (grade == 3 ){
                location = "Aquarium";
                groupNumber = 5;
                nameOfTeacher = "Ms Wilson";
            }else if(grade == 4){
                location = "Aquarium";
                groupNumber = 5;
                nameOfTeacher = "Ms Wilson";
            }else{
                location = "Aquarium";
                groupNumber = 5;
                nameOfTeacher = "Ms Wilson";
            }
        }else{
            System.out.println("Invalid");
        }
        System.out.println("location - "+location+"\n group "+groupNumber+"\n teacher "+ nameOfTeacher);



    }
}
