package day28_ArrayList;

public class StrongPassword<isStrongPassword> {

    public static void main(String[] args) {
        
        String password = "Cydeo1980@";
        
        boolean r1 = password.length()>=8 && !password.contains(" ");
        boolean r2 = false; //has upper case letters
        boolean r3 = false; //has lower case letters
        boolean r4 = false; // has special character
        boolean r5 = false; //has digit
        
        char[] chars =  password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)){
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3 = true;
            }else if(Character.isDigit(each)){
                r5 = true;
            }else{
                r4 = true;
            }
        }
        
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        System.out.println("isStrongPassword = " + isStrongPassword);
        
        
        
    }

    public static boolean isStrong(String password){

        boolean r1 = password.length()>=8 && !password.contains(" ");
        boolean r2 = false; //has upper case letters
        boolean r3 = false; //has lower case letters
        boolean r4 = false; // has special character
        boolean r5 = false; //has digit

        char[] chars =  password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)){
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3 = true;
            }else if(Character.isDigit(each)){
                r5 = true;
            }else{
                r4 = true;
            }
            if(r2 && r3 && r4 && r5){
                break;
            }
        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }


}
