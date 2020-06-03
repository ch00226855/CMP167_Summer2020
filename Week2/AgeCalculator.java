import java.util.Scanner;

public class AgeCalculator {
    /*
     Write a program that asks the user to enter the year of birth,
     and then output the user age.
     */
    public static void main(String[] args) {

        int birthYear; // create a variable to store year of birth
        int userAge; // store the age of user

        // 1. ask the user to enter the year of birth
        Scanner scnr = new Scanner(System.in); // create a scanner object
        System.out.println("Please enter the year of birth:");
        birthYear = scnr.nextInt();

        // 2. calculate the user age
        userAge = 2020 - birthYear;

        // 3. output the user age
        System.out.println("Your age is: " + userAge + ".");
    }
}
