import java.util.Scanner;

public class Output {

    public static void main(String[] args) {

        String str1 = "Today is Thursday.";
        // print() will print the String without a newline.
        System.out.print(str1);
        System.out.print("\n");
        System.out.print("ABCDE\n");
//        System.out.println();

        // println() prints with a newline at the end.

        // printf() prints things with a format
        // printf() requires multiple input values.
        // If you want to print a string with n format specifiers, you need to
        // pass n values to the method.
        double pi = 3.14159;
        System.out.printf("The value of pi is: %.3f | Here is another: %.3f\n", pi, 1.234567);
        System.out.printf("The value of pi is: %.4f\n", pi);

        // Printing variables that are not strings.
        System.out.println(1.2345); // 1.2345 will be converted to "1.2345"
        System.out.println(1.5e6); // 1.5e6 will be converted to "1500000.0"
        System.out.println('a'); // a character will be converted to a string

        // What about reference types?
        // Try printing out a Scanner object
        Scanner scnr = new Scanner(System.in);
        // for an object, it usually has a method call toString(), which
        // will convert the object to a String.
        System.out.println(scnr);

        // We can also create a formatted string
        String formatStr = String.format("The value of pi is: %.4f\n", pi);
        System.out.println(formatStr);
        System.out.println(formatStr);

        // Specify the output width to have multiple line aligned
        System.out.printf("Number 1: %-+11.2f\n", 1.2345);
        System.out.printf("Number 2: %-+11.2f\n", -1000.4);
        System.out.printf("Number 3: %-+11.2f\n", 87.65);
        System.out.printf("Number 4: %-+11.2f\n", 148596.29384723);

        // String formatting:
        System.out.printf("First Name: %-10s | Last Name: %s\n", "Harry", "Porter");
        System.out.printf("First Name: %-10s | Last Name: %s\n", "Ron", "Weasley");
        System.out.printf("First Name: %-10s | Last Name: %s\n", "Hermione", "Granger");



    }

}
