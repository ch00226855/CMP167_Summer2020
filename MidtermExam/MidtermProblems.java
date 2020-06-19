/*
write a public static method named replaceLast that takes in a String s and a char c
 as arguments. The method will Return a modified String replacing the last character 
 with the one that was passed in. (Do not print out the String)
*/

public class MidtermProblems {

    public static void main(String[] args) {
       // Test evens() method
    //    System.out.println(evens(8));
    //    System.out.println(evens(7));

        // Test sumAll() method
        System.out.println(sumAll(2, 5));
        System.out.println(sumAll(-4, 3));
        System.out.println(sumAll(3, 3));
    }

    public static String replaceLast(String s, char c) {

        // Special case 1: s is a null String
        if (s == null) {
            return null;
        }

        // Special case 2: s is an empty string
        if (s.equals("")) {
            return "";
        }

        // 1. Extract the substring up to the last character.
        String s2 = s.substring(0, s.length() - 1); 
        // stop at the second-to-last character.
        // What is the index of this character?
        // The length of the string is s.length()
        // The index of the last char is s.legnth() - 1
        // The index of the second-to-last char is s.length() - 2

        // 2. Concatenate this substring with the new character.
        String fullString = s2 + c; // + does concatenation.

        // 3. Return the new string.
        return fullString;

    }

    /*
    write a public static method named difference that takes in 2 arguments, 
    int a and int b

Calculate the difference between a and b and return a String as shown below.

If the absolute value of the difference is greater than 10, 
    return “Big Difference” + diff.
If the absolute value of the difference is less than 10, 
    return “Small Difference” + diff.
If there is NO difference between the two numbers, return “EQUAL”
*/
    public static String difference(int a, int b) {

        // 1. calculate the difference of a and b
        int diff = a - b;

        // 2. determine whether the difference is big, small, or none
        if (Math.abs(diff) >= 10) {
            return "Big Difference " + diff;
        } else if (diff != 0) {
            return "Small Difference " + diff;
        } else {// diff == 0
            return "EQUAL";
        }

        // 3. constrct the string accordingly.

        // 4. return the string

    }

    public static void differenceTest() {
        int a;
        int b;
        String outcome;
        String expected;
        // Case 1: a = 5, b = 3
        a = 5;
        b = 3;
        outcome = difference(a, b);
        expected = "Small Difference 2";
        System.out.println("Input: " + a + ", " + b);
        System.out.println("Output: " + outcome);
        System.out.println("Test passed? " + outcome.equals(expected));

        // Case 2:
        a = -10;
        b = 20;
        outcome = difference(a, b);
        expected = "Big Difference -30";
        System.out.println("Input: " + a + ", " + b);
        System.out.println("Output: " + outcome);
        System.out.println("Test passed? " + outcome.equals(expected));        
    }

    // Problem 3:
    // Write a public static method named evens that takes in 1 argument int a,
    // and returns a String containing all even numbers, separated by a space, 
    // from 0 up to that number inclusive. Remember to assure the argument a is 
    // positive. If the argument a is negative, return a String that says “NONE”
    public static String evens(int a) {
        if (a < 0) {
            return "NONE";
        }
        // if Java gets here, a will be at least 0.
        String output = "";
        for (int i = 0; i <= a; i += 2) {
            // append i and a space to the output string
            // if i is the last value, don't append the space
            // find the expression if i is the last value in the sequence
            // a = 8: 0 2 4 6 8 --> 8 is the last value
            // a = 6: 0 2 4 6   --> 6 is the last value
            // a = 7: 0 2 4 6   --> 6 is the last value
            // a = 5: 0 2 4     --> 4 is the last value
            if (i == a || i == a - 1) {
                output = output + i;
            } else {
                output = output + i + " ";
            }
        }
        return output;
    } 

    // Problem 4:
    /* Write a public static method name sumAll that takes in 2 arguments int a, int b,
     and returns the sum of all values between those two numbers inclusive. Remember a 
     can be less than b, but b might be less than a, or they may be equal.
     */
    public static int sumAll(int a, int b) {

        // if a == b, return a + b
        if (a == b) {
            return a + b;
        }

        // if a < b, sum all values from a to b.
        int sum = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i; // sum = sum + i;
            }
            return sum;
        }

        // if b < a, sum all values from b to a.
        sum = 0;
        if (a > b) {
            for (int i = b; i <= a; i++){
                sum += i;
            }
            return sum;
        }

        return -999999;
    }
    
}