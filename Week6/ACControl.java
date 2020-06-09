public class ACControl {

    public static void main(String[] args) {
        /*
If temperature > 80, turn both on.
If 70 < temperature <= 80 and humidity > 0.5, turn on the air conditioner.
If 70 < temperature <= 80 and humidity < 0.5, turn on the evaporate cooler.
Otherwise, keep both off.
         */
        // Solution 1: Use long expressions
        int temperature = 75;
        double humidity = 0.6;
        if (temperature > 80) {
            System.out.println("Turn on the air conditioner.");
            System.out.println("Turn on the evaporate cooler.");
        } else if (temperature > 70 && temperature <= 80 && humidity > 0.5) {
            System.out.println("Turn on the air conditioner.");
        } else if (temperature > 70 && temperature <= 80 && humidity < 0.5) {
            System.out.println("Turn on the evaporate cooler.");
        } else {
            System.out.println("Keep both off.");
        }

        // Solution 2: use boolean variables
        boolean isReallyHot = (temperature > 80);
        boolean isRegularHot = temperature > 70 && !isReallyHot;
        boolean isHumid = (humidity > 0.5);

        if (isReallyHot) {
            System.out.println("Turn on the air conditioner.");
            System.out.println("Turn on the evaporate cooler.");
        } else if (isRegularHot && isHumid) {
            System.out.println("Turn on the air conditioner.");
        } else if (isRegularHot && !isHumid) {
            System.out.println("Turn on the evaporate cooler.");
        } else {
            System.out.println("Keep both off.");
        }


    }
}
