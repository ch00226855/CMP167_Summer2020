import java.util.Scanner; // importing Scanner from the util package.

public class SalaryCalculator {

    public static void main(String[] args) {

        // This program will calculate annual salary from hourly pay rate.
        // double forward slashes indicates that this is a "comment".
        // A comment will be ignored by the compiler.

        // Store the hourly pay rate as a variable.
//        int hourlyRate = 20;

        // Declare the hourly pay rate variable
        int hourlyRate;

        // Create a scanner object that listens to keyboard input.
        System.out.println("Please enter the hourly rate as an integer:");
        Scanner scnr = new Scanner(System.in);





        hourlyRate = scnr.nextInt(); // this will convert the keyboard input to an integer.

        // Declare another variable to store the annual salary.
        int annualSalary;

        // Calculate the annual salary in this way:
        // annualSalary = hourlyRate * 40 * 50
        annualSalary = hourlyRate * 40 * 50;

        // Print the annual salary to the screen
//        System.out.print("The annual salary is:");
//        System.out.print(annualSalary);
//        System.out.println(".");
        // print will not automatically start a new line.
        // We can use + to concatenate multiple outputs.
        System.out.println("The annual salary is:" + annualSalary + ".");


    }

}
