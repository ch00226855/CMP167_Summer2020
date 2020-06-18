import java.util.Scanner;

public class SwapValues {
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter two integers:");

        int p = scnr.nextInt();
        int q = scnr.nextInt();
        scnr.close();

        swap(p, q);

        System.out.println("p: " + p);
        System.out.println("q: " + q);

    }

    public static void swap(int p, int q) {
        q = p;
        p = q;
    }

}