public class SumOfArray {

    public static void main(String[] args) {
        
        int[] ary = {14, 52, 365, 7345, 34, -29, -49, 0, 1, 9};

        int sumSoFar;

        // calculate sum without using a loop
        // sum = ary[0] + ary[1] + ary[2] + ary[3] + ary[4] +
        //         ary[5] + ary[6] + ary[7] + ary[8] + ary[9];

        // Use a for loop to calculate the sum
        sumSoFar = 0;
        for (int i = 0; i < ary.length; i++) {
            sumSoFar = sumSoFar + ary[i];
        }

        System.out.println("Sum: " + sumSoFar);

    }
    
}