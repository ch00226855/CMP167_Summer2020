import java.util.Scanner;

public class WordConverter {

    public static void main(String[] args) {

        /*
Write a program that asks the user for a word, and then output the word with first
letter in upper case.
         */
        Scanner scnr = new Scanner(System.in);
        System.out.print("Please enter a word: "); // use print to keep input
                                                    // on the same line
        String userInput = scnr.next();

        // Change the first letter to uppercase
        // 1. extract the first letter --> charAt(0)
        char firstLetter = userInput.charAt(0);
        // 2. convert the letter to uppercase --> toUpperCase()
        char firstLetterUpper = Character.toUpperCase(firstLetter);
        // 3. extract the substring from index 1 to the end --> substring()
        int stringLength = userInput.length();
        String subString = userInput.substring(1, stringLength);
        // OR
        // String subString = userInput.substring(1);
        // 4. concatenate the uppercase letter with the rest of the string: --> +
        String newString = firstLetterUpper + subString;
        // Output the new string
        System.out.println(newString);


    }
}
