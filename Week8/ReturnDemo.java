public class ReturnDemo {

    // Create a method that returns the absolute of an integer.
    public static int abs(int x) {
        // if x >= 0, then the absolute value is x.
        // if x < 0, then the absolute value is -x.
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    public static int getAge(int birthYear) {
        // Add error checking code:
        if (birthYear > 2020) {
            System.out.println("ERROR: Invalid birthYear: " + birthYear);
            return -1;
        }

        return (2020 - birthYear);
    }
    public static void main(String[] args) {
        
        System.out.println("Absolute value of -10: " + abs(-10));

        System.out.println("The age: " + getAge(2050));

    }
    
}