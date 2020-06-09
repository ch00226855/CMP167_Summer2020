public class LeapYearChecker {

    public static void main(String[] args) {
        /*
If a year is not divisible by 4, then it is not a leap year.
If a year is divisible by 100 but not divisible by 400,
then it is not a leap year.
Otherwise, it is a leap year.
         */
        // Solution 1: use long expressions
        int year = 2100;
        if (year % 4 != 0) {
            System.out.println("Not a leap year.");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("Not a leap year.");
        } else {
            System.out.println("A leap year.");
        }

        // Solution 2: use boolean variables
        boolean divisibleBy4 = (year % 4 == 0);
        boolean divisibleBy100 = (year % 100 == 0);
        boolean divisibleBy400 = (year % 400 == 0);

        if (!divisibleBy4) {
            System.out.println("Not a leap year.");
        } else if (divisibleBy100 && !divisibleBy400) {
            System.out.println("Not a leap year.");
        } else {
            System.out.println("A leap year.");
        }

    }
}
