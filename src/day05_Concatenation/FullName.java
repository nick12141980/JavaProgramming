package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Albert";
        String lastName = "Einstein";
        int age = 142;
        String jobTitle = "Cemetery Resident";
        String companyName = "Graveyard";
        double salary = 1_000_000.95;
;
        String fullName = firstName + " " + lastName;

        System.out.println("Hi my name is not " + firstName + " " + lastName + ".");

        System.out.println(fullName + " would be " + age + " years old.");

        System.out.println(fullName + " is a " + jobTitle + " at " + companyName + ".");

        System.out.println(fullName + "'s salary is $" + salary + ".");

    }
}
