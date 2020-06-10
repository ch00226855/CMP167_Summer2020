public class ForLoopExamples {

    public static void main(String[] args) {

        // Example 1: Print a sentence 10 times.
        for (int i = 0; i < 10; i++) {
            System.out.println("This sentence will repeat 10 times.");
        }

        // Example 2: Write a for loop where the loop index increments from 0 to 9.
        // Print the loop index during each iteration.
        for (int i = 0; i < 10; i++) {
            // print out the loop index
            System.out.println("Current loop index: " + i);
        }

        // Example 3: Write a for loop where the loop index 
        // increments from 0 to 9. Print the square of the loop
        // index during each iteration.
        for (int i = 0; i < 10; i++) {
            // print out i squared
            // int sqr = i * i;
            // System.out.print(sqr + " ");
            System.out.print(i*i + " ");
        }

// Example 4: Print the first 10 powers of 2: 1, 2, 4, 8, ...
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.0f ", Math.pow(2, i));
        }
    // What if I want 2 4 8 ...
    // loop index: 0 1 2 3 4 5 6 7 8 9
    // exponent:   1 2 3 4 5 6 7 8 9 10
    // expression to get exponent: i + 1
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.0f ", Math.pow(2, i + 1));
        }

    // Example 5: Write a for loop where the loop index increments
    //  from 0 to 20, only covering even numbers. Print the loop
    // index during each iteration.
    // loop index: 0 2 4 6 8 10 12 14 16 18 20
        System.out.println();
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i + " ");
        }
    // Example 6: Write a for loop where the loop index increments
    // from -11 to 19, only covering odd numbers.
    // Print the loop index during each iteration and
    // calculate the sum of these numbers.
    // loop index: -11, -9, -7, -5, -3, -1, 1, 3, ..., 19
        int sum = 0;
        for (int i = -11; i < 20; i += 2) {
            System.out.println(i + " ");
            sum = sum  + i; // add current i to sum
        }
        System.out.println("Sum: " + sum);
    // Example 7: Write a for loop where the loop index decrements
    // from 9 to 0. Print the loop index during each iteration 
    // and calculate the sum of these numbers.
        // loop index: 9 8 7 6 5 4 3 2 1 0 (-1)
        // Expression: i >= 0
        sum = 0;
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
            sum += i; // same as sum = sum + i;
        }
        System.out.println("Sum: " + sum);

    // Example 8: decrement like 90, 80, 70, ..., 0. (-10)
    // Calculate the sum.
        sum = 0;
        for (int i = 90; i >= 0; i = i - 10) {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);
// Example 9: Print 90, 80, ..., 0. while have loop index
// decrement from 9 to 0.
// loop index  :  9  8  7  6  5  4  3  2  1 0
// value I want: 90 80 70 60 50 40 30 20 10 0
// expression to get the second row of values from loop index:
// i * 10
        for (int i = 9; i >= 0; i--) {
            System.out.println(i * 10);
        }
        

    }
}
