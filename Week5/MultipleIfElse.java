import java.util.Scanner;

public class MultipleIfElse {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("How many years have you been married?");
        int yearsMarried = scnr.nextInt();

        // Use double equal sign to check equality
        // Single equal sign is already reserved for variable assignment.
        if (yearsMarried == 1) {
            System.out.println("This year would be your paper anniversary.");
        } else if (yearsMarried == 10) {
            System.out.println("This year would be your tin anniversary.");
        } else if (yearsMarried == 25) {
            System.out.println("This year would be your silver anniversary.");
        } else if (yearsMarried == 50) {
            System.out.println("This year would be your gold anniversary.");
        } else if (yearsMarried == 60) {
            System.out.println("This year would be your diamond anniversary.");
        } else {
            System.out.println("Nothing is special this year.");
        }

        // Alternative approach: use switch statement
        switch (yearsMarried) {
            case 1:
                System.out.println("This year would be your paper anniversary.");
                break;
            case 10:
                System.out.println("This year would be your tin anniversary.");
                break;
            case 25:
                System.out.println("This year would be your silver anniversary.");
                break;
            case 50:
                System.out.println("This year would be your gold anniversary.");
                break;
            case 60:
                System.out.println("This year would be your diamond anniversary.");
                break;
            default:
                System.out.println("Nothing is special this year.");
        }

    }

}
