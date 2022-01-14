package day39_Recap.cydeoTask;

public class Student extends Person{

    public Student(String name, int age, char gender, int studentID, String fieldOfStudy) {
        super(name, age, gender);
       setStudentID(studentID);
       setFieldOfStudy(fieldOfStudy);
    }

    private int studentID;
    private String fieldOfStudy;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public void study(){

    }
}
