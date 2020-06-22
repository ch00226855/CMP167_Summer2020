import java.util.Arrays;

public class TaxCalculator {

    static double[] incomeCutOffs = {0, 20000, 50000, 100000};
    static double[] taxRates = {0.1, 0.15, 0.2, 0.25};

    public static void main(String[] args) {
        
        // Assume that:
        // For income less than 20000, the tax rate is 10%
        // between 20K - 50k,                          15%
        // between 50k - 100k,                         20%
        // above   100k                                25%

        // 1. enter the amount of annual salary
        double annualSalary = 56789;

        // 2. determine the tax rate that should be applied.
        double taxRate = -1.0;
        // if (annualSalary < 20000) {
        //     taxRate = 0.1;
        // } else if (annualSalary < 50000) {
        //     taxRate = 0.15;
        // } else if ....
        
        // Write something that is equivalent to the above if-else branches without 
        // using hard-coded values.

        // loop through all income intervals, determine which interval contains
        // user's annual salary.
        for (int i = 0; i <= incomeCutOffs.length - 2; i++) {
            // Identify an interval: incomeCutOffs[i] - incomeCutOffs[i+1]
            if (incomeCutOffs[i] <= annualSalary && annualSalary < incomeCutOffs[i+1]) {
                taxRate = taxRates[i];
                break; // end the loop whenever we found the interval
            }
        }


        // 3. print the amount of tax.
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Tax Due: " + (annualSalary * taxRate));


        System.out.println("-------------------------------");
        double[] annualSalaryArray = {12345.0, 34567.0, 56789.0, 98765.0};
        double[] taxDueArray = getTaxes(annualSalaryArray);
        System.out.println(Arrays.toString(taxDueArray));

    }

    public static double[] getTaxes(double[] ary) {

        double annualSalary, tax;
        double[] taxes = new double[ary.length];
        for (int i = 0; i < ary.length; i++) {
            annualSalary = ary[i];
            tax = getTax(annualSalary); 
            taxes[i] = tax;
        }
        return taxes;
    }

    public static double getTax(double salary) {
        double taxRate = -1.0;
        for (int i = 0; i <= incomeCutOffs.length - 2; i++) {
            // Identify an interval: incomeCutOffs[i] - incomeCutOffs[i+1]
            if (incomeCutOffs[i] <= salary && salary < incomeCutOffs[i+1]) {
                taxRate = taxRates[i];
                break; // end the loop whenever we found the interval
            }
        }
        return salary * taxRate;
    }
    
}