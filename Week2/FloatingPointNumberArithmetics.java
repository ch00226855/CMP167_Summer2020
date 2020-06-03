public class FloatingPointNumberArithmetics {

    public static void main(String[] args) {

        // Division by zero
        System.out.println("Dividing a positive value with zero: " + (2.3 / 0.0));
        System.out.println("Dividing a negative value with zero: " + (-2.3 / 0.0));
        System.out.println("Dividing zero with zero: " + (0.0 / 0.0)); // NaN: Not a number

        // Scientific Notation
        // World population: 7,788,000,000
        // (Commas are now allowed in java): 7788000000
        // Scientific notation: 7.788E9 (e represents "times 10 to the power of")
        System.out.println("World population: " + (7.788E9));
        // with of human hair: 0.0000000017 meter
        // In scientific notation: 1.7E-9 meter
        System.out.println("Width of human hair: " + (1.7E-9) + "meter");

        // By default, all effective digits of a floating-point number will be printed.
        // We can control the number of decimal digits using a format.
        System.out.println("println: 1.0 / 3.0 = " + (1.0 / 3.0));
        // Print only two decimal digits
        System.out.printf("printf: 1.0 / 3.0 = %.2f", (1.0 / 3.0));
        // Use printf instead of println
        // add "%.2f" that represents "a floating-point number with 2 decimal digits
        // change + into a comma
    }

}
