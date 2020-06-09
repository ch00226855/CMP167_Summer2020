public class StringMethods {

    public static void main(String[] args) {

        String fullString = "A String is a sequence of characters.";
        // Extract the subtring between the 10-th and 20th letter.
        String subString = fullString.substring(10, 20);
        System.out.println(subString);

        // Since the second index is exclusive, we need to add 1
        // to the last index we want to include.
        String subString2 = fullString.substring(10, 13);
        System.out.println(subString2);

        // In fullString, change every single i into 3 i's
        String modifiedString = fullString.replace("i", "iii");
        System.out.println(modifiedString);

    }
}
