package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {
        int score = 91;
/*
        if (score >= 90){ // boolean a
            System.out.println("Excellent");
        }
        if (score >= 80 && score < 90){ // score >= 80 && !a;
            System.out.println("Great");
        }
        if (score >= 70 && score < 80){
            System.out.println("Good");
        }
*/
        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && !a;
        boolean c = !a && !b && score >= 70;
        boolean d = !a && !b && !c && score <= 69;
        boolean f = !a && !b && !c && !d;

        if (a){
            System.out.println("Excellent");
        }
        if (b){
            System.out.println("Great");
        }
        if (c){
            System.out.println("Good");
        }
        if (d){
            System.out.println("Passed");
        }
        if (f){
            System.out.println("Failed");
        }

    }
}
/*
score:
90 - 100 ==> Excellent
80 - 89 ==> Great
70 - 79 ==> Good
60-69 ==> Passed
0 - 59 ==> Failed
 */