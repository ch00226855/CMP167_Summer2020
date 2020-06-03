import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int amountECD;
        int amountDP;
        int amountBR;
        double amountUSD;

        // 1. Prompt user to enter the amount of foreign currencies.
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter number of Eastern Caribbean Dollars :");
        amountECD = scnr.nextInt();
        System.out.println("Enter number of Dominican Pesos :");
        amountDP = scnr.nextInt();
        System.out.println("Enter number of Brazilian Reals :");
        amountBR = scnr.nextInt();

        // 2. Convert to USD.
        // Total amount in USD: amountECD * 0.37 + amountDP * 0.019 + amountBR * 0.239
        amountUSD = amountECD * 0.37 + amountDP * 0.019 + amountBR * 0.239;

        // 3. Output the amount in USD.
        // Expected output: US Dollars = $total amount of US Dollars
        // Use printf to print the double value with format
        // Use %.2f to specify the format to be "floating-point number with 2 decimal digits"
        System.out.printf("US Dollars = $%.2f", amountUSD);

    }

}
