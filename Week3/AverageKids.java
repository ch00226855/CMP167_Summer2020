public class AverageKids {

    /*
    Family 1 has 3 children.
    Family 2 has 4 children.
    Family 3 has 1 child.
    Write a program that calculates the average number of children per family.
     */

    public static void main(String[] args) {

        int numKidsFamily1 = 3;
        int numKidsFamily2 = 4;
        int numKidsFamily3 = 1;

//        double avgNumKids = (double)(numKidsFamily1 + numKidsFamily2
//                + numKidsFamily3) / (double)3;

//        double avgNumKids = (double)(numKidsFamily1 + numKidsFamily2
//                + numKidsFamily3) / 3;

        double avgNumKids = (numKidsFamily1 + numKidsFamily2
                + numKidsFamily3) / 3.0;

        // THE STATEMENT BELOW DOES NOT WORK!
//        double avgNumKids = (numKidsFamily1 + numKidsFamily2
//                + numKidsFamily3) / 3;

//        double avgNumKids = (double)((numKidsFamily1 + numKidsFamily2
//                + numKidsFamily3) / 3);

        System.out.println("Average:" + avgNumKids);

    }

}
