package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        /*
        90 - 100: excellent
        80 - 89: great
        70 - 79: good
        60 - 69: passed
        0 - 59: failed
         */
        /*
      int s = 77;

      if (s >= 0 && s <= 100){
          // 5 possibilities
          if  (s >= 90){
              System.out.println("Excellent");
          }else if (s >= 80){
              System.out.println("Great");
          } else if (s >= 70) {
              System.out.println("Good");
          }else if (s >= 60){
              System.out.println("Passed");
          }else
              System.out.println("Failed");

      }else{
          System.out.println("Invalid");
      }

        System.out.println("----------------");

      String result = "";// temporary value

        if (s >= 0 && s <= 100){
            // 5 possibilities
            if  (s >= 90){
                result = "Excellent";
            }else if (s >= 80){
                result = "Great";
            } else if (s >= 70) {
                result = "Good";
            }else if (s >= 60){
                result = "Passed";
            }else
                result = "Failed";

        }else {
            System.out.println("Invalid");

        }
        System.out.println(result);
*/
        int s = 85;
        String result = (s>=0 && s<=100)? (s>=90)? "Excellent" :(s>=80)? "Great" :(s>=70)? "Good" :(s>=60)? "Passed"
                : "Failed" : "Invalid Score";
        System.out.println(result);


        }
}
