import java.util.Scanner;

public class SwapValues {
    
    // This program should swap values of p and q.
    // Example input: 100 200
    // Output: 
    // p: 200
    // q: 100
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter two integers:");

        int p = scnr.nextInt();
        int q = scnr.nextInt();
        scnr.close();

        swap(p, q); // Can swap() change the value of p and q at all?

        // Do value swap here:
        // // Suppose input values are 100 200
        // // p holds 100, q holds 200
        // p = q; // 200 is assigned to p
        // // p holds 200, q holds 200 (100 is gone!!!)
        // q = p; // 200 is assigned to q
        // // p holds 200, q holds 200

        // Correct solution: use a temp variable to hold value of p
        int temp = p;
        // temp holds 100, p holds 100, q holds 200
        p = q; // 200 is assigned to p
        // temp holds 100, p holds 200, q holds 200
        q = temp; // 100 is assigned to q
        // temp holds 100, p holds 200, q holds 100

        System.out.println("p: " + p);
        System.out.println("q: " + q);

    }

    public static void swap(int p, int q) {
        // q = p;
        // p = q;
        p = 1000; // no matter what value we assign here,
        q = 2000; // it does not affect p and q in main()
        // The variable p and q used here are different from p and q defined in main().
    }

}