import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("What is today's date?");
        String userInput = scnr.nextLine();

        // if userInput is "June 8th", output "Correct!"
        // otherwise, output "Wrong answer!"
        // check if userInput equals "June 8th": use userInput.equals("June 8th")
        if (userInput.equals("June 8th")) {
            System.out.println("Correct!");
        } else if (userInput.equals("06/08")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong answer!");
        }

        // Alternative approach
        switch (userInput) {
            case "June 8th":
                System.out.println("Correct!");
                break;
            case "06/08":
                System.out.println("Correct!");
                break;
            default:
                System.out.println("Wrong answer!");
        }

    }

}
