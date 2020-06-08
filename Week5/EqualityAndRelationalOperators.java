public class EqualityAndRelationalOperators {

    public static void main(String[] args) {

        final int ADULT_AGE = 18;
        int myAge = 50;
        if (myAge >= ADULT_AGE) {
            System.out.println("I am an adult.");
        } else {
            System.out.println("I am not an adult.");
        }

        if (myAge - 20 >= ADULT_AGE) {
            System.out.println("I was an adult 20 years ago.");
        } else {
            System.out.println("I wasn't an adult 20 years ago.");
        }

        // compare characters
        char myGrade = 'F';
        if (myGrade == 'A') {
            System.out.println("Great job!");
        } else if (myGrade == 'B') {
            System.out.println("A decent grade!");
        } else if (myGrade == 'C') {
            System.out.println("Could be better...");
        } else if (myGrade == 'F') {
            System.out.println("Too bad!");
        }

        // Use equals() method to compare strings
        String dayOfWeek = "Monday";
        if (dayOfWeek.equals("Monday")) {
            System.out.println("Four more days until weekend.");
        } else {
            System.out.println("Closer to weekend than Monday is!");
        }

        // Check alphabetical order of strings
        String name1 = "David";
        String name2 = "Bob";

        if (name1.compareTo(name2) < 0) {
            System.out.println(name1 + " " + name2);
        } else {
            System.out.println(name2 + " " + name1);
        }

        // Because Java stores floating-point numbers with
        // rounding, it is not a good idea to check equality
        // of two decimal values.
        double myDouble1 = 1.0 / 3.0;
        double myDouble2 = (10000 + 1) / 3.0 - 10000 / 3.0;
        System.out.println("myDouble1:" + myDouble1);
        System.out.println("myDouble2:" + myDouble2);

        if (myDouble1 == myDouble2) {
            System.out.println("myDouble1 is equal to myDouble2.");
        } else {
            System.out.println("myDouble1 is different from myDouble2.");
        }
        // Instead we should specify an error threshold,
        // and consider two decimal are equal as long as
        // their difference is less the threshold
        double threshold = 0.0000001;
        if (myDouble1 < myDouble2 + threshold && // & <-- Shift + 7
            myDouble1 > myDouble2 - threshold) {
            System.out.println("myDouble1 is equal to myDouble2.");
        } else {
            System.out.println("myDouble1 is different from myDouble2.");
        }


    }

}
