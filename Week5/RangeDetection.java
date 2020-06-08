public class RangeDetection {

    public static void main(String[] args) {

        int myInt = 1;
        // detect if myInt is between 10 and 15.
        // We need: myInt > 10 and myInt < 15
        if (myInt > 10 && myInt < 15) {
            System.out.println("myInt is between 10 and 15.");
        } else {
            System.out.println("myInt is not between 10 and 15.");
        }

        // OR operator
        char passingGrade = 'B';
        char myGrade = 'B';
        if (myGrade == 'A' || myGrade == 'B') {
            System.out.println("You can now register Programming II.");
        } else {
            System.out.println("You cannot register Programming II.");
        }

        // Not operator
        int myAge = 30;
        if (!(myAge < 21)) {
            System.out.println("You are allowed to buy alcohol.");
        } else {
            System.out.println("You are too young to buy alcohol.");
        }

        if (!(myAge > 13 && myAge < 18)) {// Not between 13 and 18
            System.out.println("You are not a teenager.");
        }



    }
}
