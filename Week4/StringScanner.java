import java.util.Scanner;

public class StringScanner {

    public static void main(String[] args) {

        String toBeParsed = "First Name: Ron      | Last Name: Weasley";
        Scanner scnr = new Scanner(toBeParsed);
        String firstName, lastName;

        scnr.next();
        scnr.next();
        firstName = scnr.next();
        System.out.println("First Name: " + firstName);
        scnr.next(); // This will extract "|"
        scnr.next(); // This will extract "Last"
        scnr.next(); // This will extract "Name:"
        lastName = scnr.next(); // This will extract "Porter"
        System.out.println("Last Name: " + lastName);

    }

}
