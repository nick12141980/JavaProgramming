package day24_CustomMethod_Return;

public class WarmupTasks {

    /*
    1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has
     */

    public static void main(String[] args) {
        initials("Nick","Shilov");
        domain("cydeo@gmail.com");

        System.out.println("_________");

        String[] emails = {"josh@gmail.com","jim@yahoo.com","nick@cydeo.com"};

        for (String email : emails) {
            domain(email);
        }
        System.out.println("------------------");
        nameOfMonth(12);


    }

    public static void initials(String firstName,String lastName){
        String initial = firstName.charAt(0)+"."+lastName.charAt(0)+".";
        initial = initial.toUpperCase();
        System.out.println(initial);
    }

    public static void domain(String email){
        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println(domain);
    }

    public static void nameOfMonth(int number){
        String name = "";
        if(!(number>=1 && number<=12)){
            System.out.println("Invalid");
        }else{
            name = (number == 1)?"January":(number==2)?"February":(number==3)?"March":(number==4)?"April":(number==5)?"May"
                    :(number==6)?"June":(number==7)?"July":(number==8)?"August":(number==9)?"September":(number==10)?"October"
                    :(number==11)?"Novemer":"December";
        }
        System.out.println(name);
    }



}
