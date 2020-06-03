import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {

        String str1 = "674";
        String str2 = "135";
        System.out.println(str1 + str2);
        // Casting to int will not make java recognize the value
//        System.out.println((int)str1); // will give an error

        // primitive data types: int, float, double, char
        //                       byte (1KB = 1024 bytes, 1MB = 1024 KB, 1GB = 1024MB)
        //                       boolean (true, false)
        //                       short, long (variations of int)

        // Everything else is a Class.
        // String is a class.

        // Load a string from user input
        // next(): load texts up to the next space.
        // nextLine(): load texts up to the end of current line.
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a line of texts:");
        String str3 = scnr.nextLine();
        System.out.println("Enter two words");
        String str4 = scnr.next();
        String str5 = scnr.next();
        System.out.println("Enter another sentence:");
        String str6 = scnr.nextLine(); // This will capture the newline symbol from
                                        // the previous input.

        System.out.println("str3:" + str3);
        System.out.println("str4:" + str4);
        System.out.println("str5:" + str5);


    }
}
