import java.util.Scanner;

public class RemoveExtraSpaces {
/*
This program removes extra spaces in a string
For example, if the target string is:
"Today      is      Monday"
The program should shrink the extra spaces and output:
"Today is Monday"
*/
    public static void main(String[] args) {

        Scanner scnr = null; // null acts as a placeholder
        String userInput = null;
        String programOutput = null;

        // Read user input
        scnr = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        userInput = scnr.nextLine();

        // Remove extra spaces
        // Solution 1: replace double space with a single space
        //   If there are two consecutive spaces in the string,
        //   use replace() to replace it with a single space.
        while (userInput.indexOf("  ") != -1) {// loop stops when there is no "  "
            System.out.println("Before: " + userInput);
            userInput = userInput.replace("  ", " ");
            System.out.println("After:  " + userInput);
        }

        // Solution 2: identify an extra space
        // A space is extra if there is another space immediately 
        // behind it. Loop through all characters, add each char
        // to programOutput if it is not an extra space.
        programOutput = "";
        int length = userInput.length();
        boolean isSpace;
        boolean hasSpaceBehind;
        for (int i = 0; i < length; i++) {
            if (i >= length - 1) {
                programOutput += userInput.charAt(i);
                break;
            }
            isSpace = (userInput.charAt(i) == ' ');
            hasSpaceBehind = (userInput.charAt(i + 1) == ' ');
            if (!isSpace || !hasSpaceBehind) {
                programOutput += userInput.charAt(i);
            }
        }


        // Print the shrinked string
        System.out.println(programOutput);
        


    }
    
}