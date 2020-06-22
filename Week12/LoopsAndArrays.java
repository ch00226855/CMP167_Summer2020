import java.util.Arrays;
import java.util.Scanner;

public class LoopsAndArrays {

    public static void main(String[] args) {
        
        /*
        ask user to enter 5 integers
        */
        // int[] userInputs = new int[5];
        int[] userInput = null; // int[] userInput;
        userInput = new int[5];

        Scanner scnr = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter an integer:");
            userInput[i] = scnr.nextInt(); // first time --> [0]
                                            // second time --> [1]
                                            // third time --> [2]
                                            // fourth time --> [3]
                                            // fifth time --> [4]
        }

        /*
         convert all negative elements to zero
         */
        for (int i = 0; i < userInput.length; i++) {
            // convert userInput[i]
            if (userInput[i] < 0) {
                userInput[i] = 0;
            }
        }

        // Make a copy of the array userInputs
        // int[] anotherArray = userInput; // assign an array like this, then they are
        //                                 // representing the same array.
        // userInput[0] = 100;

        // int[] anotherArray = new int[userInput.length];
        // for(int i = 0; i < anotherArray.length; i++) {
        //     anotherArray[i] = userInput[i]; // values are being copied
        // }
        int[] anotherArray = userInput.clone(); // create an actual copy
        userInput[1] = 200;

        System.out.println(Arrays.toString(userInput));
        System.out.println(Arrays.toString(anotherArray));

        String str1 = "Monday";
        String str2 = str1; // both str1 and str2 are refering to the same string.
        str1 = "Tuesday";
        System.out.println(str1);
        System.out.println(str2);

        Journal j1 = new Journal();
        j1.name = "SOMENAME";
        Journal j2 = j1; // j1 and j2 are refering to the same object.
        j1.name = "OTHERNAME";
        System.out.println(j1.name);
        System.out.println(j2.name);


        //create two array of integers, determine how many values from
        // the first array are greater than the corresponding value from the second array.
        int[] intArray1 = {3, 89, 56, 47, -10};
        int[] intArray2 = {56, 7, 29, 87, 57};
        int count = 0;
        for (int i = 0; i < intArray1.length; i++) {
            // do something intArray1[i] and intArray2[i]
            if (intArray1[i] > intArray2[i]) {
                count++;
            }
        }
        System.out.println("Count: " + count);


        


        // System.out.println(userInput);
        // for (int i = 0; i < userInput.length; i++) {
        //     System.out.print(userInput[i] + " ");
        // }



    }
    
}