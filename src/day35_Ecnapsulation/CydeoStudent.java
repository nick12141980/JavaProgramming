package day35_Ecnapsulation;

public class CydeoStudent {

    public String name;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretWord;

    public CydeoStudent(String name, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName = "Cydeo";
        programmingLanguage = "Java";
        secretWord = "Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }

    public static void printSecretWord(){
        System.out.println(secretWord);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", Programming Language='" + programmingLanguage + '\'' +
                ", School Name='" + schoolName + '\'' +
                '}';
    }
}
/*
Create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */