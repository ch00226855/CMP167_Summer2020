public class StringMethods {

    public static void main(String[] args) {

        String word = "keyboard";

        // Find the length of a string
        int len = word.length();
        System.out.println("Length: " + len);

        // Find the position of 'a'
        int positionA = word.indexOf('a');
        System.out.println("Position of a:" + positionA);

        // Find the position of 'o'
        int positionO = word.indexOf('o');
        System.out.println("Position of o:" + positionO);

    }
}
