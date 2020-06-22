import java.util.Arrays;
import java.util.Scanner;
public class Grades {

/**
This method will read a list of exam grades from the user and place them into the 
specified array. The exam grades are all int values, and there will be a negative 
number used as a sentinel value to indicate the end of the input. (Please note that 
this negative number is used only to end the reading of the grades and it should not 
be included in the array).

Your prompt to the user to enter a grade should be: "Enter a grade: "

@param grades - The array that will hold the grades that are read in.
@return The number of grades that were read from the user.
*/
    public static int readGrades(int[] grades) { // the array reference is being passed in

        int value;
        Scanner scnr = new Scanner(System.in);
        int counter = 0;
        while (true) {
            System.out.println("Enter a grade: ");
            value = scnr.nextInt();
            if (value < 0) {
                break;
            }
            grades[counter] = value; // we use array reference to locate its elements.
            counter++;
        }
        scnr.close();
        return counter;
    }

    /**
     * 
     * @param ary array of grades
     * @param firstIndex 
     * @param lastIndex
     * @return true if both index are >0, < ary.length, and firstIndex <= lastIndex.
     */
    private static boolean invalidIndex(int[] ary, int firstIndex, int lastIndex) {
        // if (firstIndex < 0) {
        //     return false;
        // } else if (firstIndex > ary.length) {
        //     return false;
        // } else if ...

        return (0 < firstIndex) && (firstIndex <= lastIndex) &&
                 (lastIndex < ary.length);
    }

    //This method is used to rotate all the elements in arr one position to the right. 
    // This rotation will result in arr[0] moving to arr[1] and arr[1] moving to arr[2] 
    // ... etc. Finally, arr[arr.length-1] moves to arr[0].
    public static void rotateElements(int[] arr) {
        // newArr[1] = arr[0];
        // newArr[2] = arr[1];
        // ...
        // newArr[arr.length-1] = arr[arr.length-2];
        int[] newArr = new int[arr.length];

        for (int i = 0; i <= arr.length-2; i++) {
            newArr[i+1] = arr[i];
        }

        newArr[0] = arr[arr.length-1];

        // copy back the values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr[i];
        }
    }

    public static void reverseArray(int[] arr) {
        // Let's say the array contains 5 numbers. {1, 2, 3, 4, 5}
        int[] newArr = arr.clone();
        // arr[0] = newArr[4]; // {5, 2, 3, 4, 5}
        // arr[1] = newArr[3]; // {5, 4, 3, 4, 5}
        // arr[3] = newArr[1]; 
        // arr[4] = newArr[0];
        for (int i = 0; i < arr.length; i++) {
            // i: 0          1         2        3       4
            // ?: length-1   length-2  length-3 ....
            arr[i] = newArr[arr.length - i - 1];
        }
    }


    // main()
    public static void main(String[] args) {
        int[] grades = new int[100];
        int numGrades = readGrades(grades);
        System.out.println(Arrays.toString(grades));
        System.out.println("Number of grades: " + numGrades);
        rotateElements(grades);
        System.out.println("Rotated array:");
        System.out.println(Arrays.toString(grades));
        rotateElements(grades);
        System.out.println("Rotated array:");
        System.out.println(Arrays.toString(grades));
        reverseArray(grades);
        System.out.println("Reversed array:");
        System.out.println(Arrays.toString(grades));
    }
    
}