/*
write a public static method named replaceLast that takes in a String s and a char c
 as arguments. The method will Return a modified String replacing the last character 
 with the one that was passed in. (Do not print out the String)
*/

public class MidtermProblems {

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
    
}