package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";
        int num = Integer.parseInt(str); //int
        System.out.println(num+1);
        System.out.println(str+1);//1231

        String str2 = "18.4";
        double num2 = Double.parseDouble(str2);
        System.out.println(num2+1);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;
        System.out.println(max2);
        System.out.println(min2);

        String s1 = "true";
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1);

        String s2 = "123";
        Integer x = Integer.valueOf(s2); //Integer
        System.out.println(x);
        int y = Integer.valueOf(s2); //int
        System.out.println(y);

        String s3 = "1.3";
        Double z = Double.valueOf(s3);
        System.out.println(z);

        //isDigit()
        char ch1 = 'j';
        boolean r2  = Character.isDigit(ch1);
        System.out.println(r2);
        boolean r3 = Character.isLetter(ch1);
        System.out.println(r3);

        boolean r4 =  !Character.isLetterOrDigit(ch1);
        System.out.println(r4);

        boolean r5 = Character.isUpperCase(ch1);
        System.out.println(r5);

        boolean r6 = Character.isLowerCase(ch1);
        System.out.println(r6);

        String s = "ab1cde2fg3hi4";
        int sum = 0;
        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum += Integer.parseInt(each+"");
            }
        }
        System.out.println(sum);


    }

}
