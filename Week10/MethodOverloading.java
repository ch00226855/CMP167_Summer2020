public class MethodOverloading {

    public static void main(String[] args) {
        datePrint(17, 6);
        datePrint(4, 7);
        datePrint(17, "June");
        datePrint(4, "July");
    }

/*
Write a program with methods datePrint(int currDay, int currMonth) and 
datePrint(int currDay, String currMonth). Use the methods to print 07/30 and July 30.
*/
    // datePrint(17, 6)
    public static void datePrint(int currDay, int currMonth) {

        System.out.printf("%02d/%02d\n", currMonth, currDay);
        // %02d requires that an integer to be shown with at least 2 digits. 0 is appended
        // if there is a single digit.
        return;

    }

    // Question: can we also write `datePrint(int currMonth, int currDay)`
    // public static void datePrint(int currMonth, int currday) {
    //     System.out.printf("%02d/%02d\n", currMonth, currDay);
    // }

    public static void datePrint(int currDay, String currMonth) {
        System.out.println(currMonth + " " + currDay);
    }

}