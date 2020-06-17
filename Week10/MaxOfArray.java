public class MaxOfArray {

    public static void main(String[] args) {
        
        double[] ary = {-1.2, -2.5, -1.5, -0.8, -2.6};

        // Find the largest value in the array
        // loop through the array, keep the largest value seen so far.
            // For each new value ary[i], compare it with the previous largest value
            // if ary[i] > previous largest value, set largest value to be ary[i].
            // if ary[i] < previous largest value, keep that value.
        // double maxSoFar = 0; // ERROR: cannot initialze with 0 
        double maxSoFar = ary[0];
        for (int i = 0; i < ary.length; i++) {
            // maxSoFar vs. ary[i]
            if (ary[i] > maxSoFar) {
                maxSoFar = ary[i];
            }
        }

        // Find the minimum of this array
        double minSoFar = ary[0];
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] < minSoFar) {
                minSoFar = ary[i];
            }
        }

        System.out.println("Max: " + maxSoFar);
        System.out.println("Min: " + minSoFar);
    }
    
}