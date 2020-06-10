public class LoopStrings {

    public static void main(String[] args) {

        String userInput = "asdf2@#34df2#%@34f%@#12";
        // loop through the string and print each character.
        int stringLength = userInput.length();
        for (int i = 0; i < stringLength; i++) {
            System.out.println(userInput.charAt(i));
        }

        // loop through the string and decide whether each char is
        // a digit.
        char c;
        boolean cIsDigit;
        for (int i = 0; i < stringLength; i++) {
            // assign the index i character to variable c
            c = userInput.charAt(i);
            // apply method isDigit() to c, and store the result.
            cIsDigit = Character.isDigit(c);
            // print the result
            System.out.println(cIsDigit);
            // System.out.println(Character.isDigit(userInput.charAt(i)));
        }

        // loop through the string and count the number of digits.
        int count = 0;
        for (int i = 0; i < stringLength; i++) {
            // assign the index i character to variable c
            c = userInput.charAt(i);
            // apply method isDigit() to c, and store the result.
            cIsDigit = Character.isDigit(c);
            // increment count if c is a digit.
            if (cIsDigit) {
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
    }

}