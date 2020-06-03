public class VariableAssignment {

    public static void main(String[] args) {

        // Variable declaration
        int a;
        int b;

        // Assign values to a and b
        a = 5;
        b = 5 + a * 2 - 10;

        // It is not a valid assignment if there is more than a variable on the left
//        a + 2 = 5;
//        int c;
//        c = 10; // Cannot assign values to a variable unless it is declared.

        // a = b will assign the value stored in b to a
//        a = b;
//        b = a;

        System.out.println(a);
        System.out.println(b);

    }
}
