public class IntegerDivision {

    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int answer;

        answer = a / b; // The exact result 0.3333 will be rounded down to 0.

        System.out.println("The answer is " + answer);

        // If we want to store the "exact" result, we need the double data type.
        double x = 1; // double means that it uses twice as much memory space
        double y = 3; // as "single" (referred to as "float" in java)

        double answer2;
        answer2 = x / y; // division between double values will give a decimal result.

        System.out.println("The second answer is " + answer2);

        // Let's do the division using the float type (rarely used nowadays)
        float c = 1;
        float d = 3;
        float answer3 = c / d;
        System.out.println("The third answer is " + answer3);

        System.out.println("Divide an int with a double: " + (a / y));
        // get a double because a is implicitly converted to type double.

        // The modulo operator %: returns the remainder of integer division
        System.out.println("5 % 3 = " + (5 % 3)); // the remainder of 5 divided by 3.
        System.out.println("11 % 5 = " + (11 % 5)); // 11 - 5 * 2 --> 1
        //------------------------------
        // 1. Modulo can be used to determine whether a number is even or odd.
        int num = 139;
        int remainder;
        remainder = num % 2;
        System.out.println("Num is odd, so remainder is " + remainder);
        // 2. Modulo can help extract the last digit of an integer.
        // Idea: (num - last digit) % 10 = 0 --> last digit = num % 10
        System.out.println("The last digit of num is " + (num % 10));
        // Trickier: use modulo te extract any specific digit.
        // 3. Determine if a day is a Tuesday.
        // June 2nd is a Tuesday
        int date = 16; // This represents a day in June.
        // date is a Tuesday if and only if (date - 2) % 7 equals 0.
        int isTuesday = (date - 2) % 7;
        System.out.println("If you see a zero, it means June " + date + " is a Tuesday: "
                        + isTuesday);

        // ---------------------------
        // Assignment with the same variable on both sides.
        int value = -10;
        value = value + 1; // assigns -10 + 1 to variable value.
        System.out.println("The new value: " + value);
        value = value + 1;
        System.out.println("The new value: " + value);

        // --------------------------
        // Compound operators: +=, -=, *=, /=, %=
        // `value += 1` means `value = value + 1`
        int count = 0;
        count += 5; // this is equivalent to count = count + 5;
        System.out.println("The new count: " + count);
        count -= 7; // this is equivalent to count = count - 7;
        System.out.println("The new count: " + count);
        // ++ and --:
        // count++ means `count = count + 1`
        // count-- means `count = count - 1`
        count = 0;
        count++; // it is recommended to use ++/-- in a separate statement
        ++count;
        ++count;
        System.out.println("Then new count:" + count);
        count--;
        --count;
        count--;
        System.out.println("Then new count:" + count);

    }

}
