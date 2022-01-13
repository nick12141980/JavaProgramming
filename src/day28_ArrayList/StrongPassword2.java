package day28_ArrayList;

public class StrongPassword2 {

    public static void main(String[] args) {

        String password = "Cydeo1234@";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialChars = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if(Character.isUpperCase(each)){
                countUpperCase++;
            }else if(Character.isLowerCase(each)){
                countLowerCase++;
            }else if(Character.isDigit(each)){
                countDigits++;
            }else{
                countSpecialChars++;
            }
        }

        boolean hasUpperCase = countUpperCase>0;
        boolean hasLowerCase = countLowerCase>0;
        boolean hasDigit = countDigits>0;
        boolean hasSpecialChar = countSpecialChars>0;

        boolean isStrongPassword = hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar &&
                password.length()>=8 && !password.contains(" ");

        System.out.println("isStrongPassword = " + isStrongPassword);


    }
}
