import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter your age:");
        int userAge = scnr.nextInt();
        System.out.println("Age: " + userAge);

        // If userAge is greater than 200, output
        // "Something does not look right."
        if (userAge > 200) {
            System.out.println("Something does not look right.");
        }

        if (userAge < 0) {
            System.out.println("You entered a negative number...");
        }
    }

}
