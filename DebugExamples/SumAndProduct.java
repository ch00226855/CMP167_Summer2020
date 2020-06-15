public class SumAndProduct {

    public static void main(String[] args) {
        // Find the sum and product of 1-20.
        int sum = 0;
        int product = 0;
        for (int i = 0; i < 20; i++) {
            sum = sum + i;
            product = product * i;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
    
}
