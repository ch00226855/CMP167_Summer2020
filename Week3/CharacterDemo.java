import java.util.Scanner;

public class CharacterDemo {

    public static void main(String[] args) {

        char myLetter = 'a';

        myLetter++;

        myLetter++;

        System.out.println("myLetter:" + myLetter);

        // Escape sequences
        System.out.println("\\\\ ---- \t ---- \n ---- \"\" ----" + '\'');


        // What integer is associated with \"?
        System.out.println((int)'a');
        char myLetter2 = '\"';
        System.out.println((int)myLetter2);

        // Get a letter from user input?
        // nextInt(): load an integer
        // nextDouble(): load a floating-point number
        // nextChar(): DOES NOT EXIST
        // Instead, use scnr.next().charAt(0)
        System.out.println("Please type a letter:");
        Scanner scnr = new Scanner(System.in);
        char userLetter = scnr.next().charAt(0);
        System.out.println(userLetter);
    }
}
