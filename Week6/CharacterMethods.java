public class CharacterMethods {

    public static void main(String[] args) {

        char myChar = 'c';

        // Determine if myChar is a letter
        System.out.println(Character.isLetter(myChar));
        System.out.println(Character.isDigit(myChar));
        System.out.println(Character.toUpperCase(myChar));

        // static methods: methods associated with a class.
        // Math.sqrt(), Math.pow(), Math.abs(), Math.random()
        // Character.isLetter(), Character.isDigit()
        // main method is also a static method.
        // java ClassName --> java will execute Class.main()

        // instance methods: methods associated with an object.
        // String methods. "Today".charAt(0) ---> 'T'
        //                 "Yesterday".charAt(0) ---> 'Y'
        // Scanner methods.
        // Scanner scnr1 = new Scanner(System.in) ---> listen to keyboard
        // Scanner scnr2 = new Scanner(someString) ---> listen to someString
        // scnr1.next() ---> return the first word entered by user
        // scnr2.next() ---> return the first word from someString

    }
}
