/*
Write a program that asks the user for three integers (firstInt, secondInt, thirdInt),
 perform the following operations and output the results:

firstResult = Add firstInt and secondInt then divide the result by thirdInt
secondResult = Multiply secondInt by thirdInt and divide the result by the sum of
                secondInt and firstInt
thirdResult = Multiply firstInt by thirdInt and find the remainder of dividing the
                result by secondInt

Your prompt to the user to enter the integers must be:
Enter firstInt:
Enter secondInt:
Enter thirdInt:

Your output must be of the format:
First Result = firstResult
Second Result = secondResult
Third Result = thirdResult
 */
import java.util.Scanner;

public class IntegerExpressions {

    public static void main(String[] args) {

        // 1. Load three integers from user.
        int firstInt, secondInt, thirdInt;
        int firstResult, secondResult, thirdResult;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter firstInt:");
        firstInt = scnr.nextInt();
        System.out.println("Enter secondInt:");
        secondInt = scnr.nextInt();
        System.out.println("Enter thirdInt:");
        thirdInt = scnr.nextInt();

        // 2. Calculate three results.
        firstResult = (firstInt + secondInt) / thirdInt;
        secondResult = secondInt * thirdInt / (secondInt + firstInt);
        thirdResult = (firstInt * thirdInt) % secondInt;

        // 3. Output the results.
        System.out.println("First Result = " + firstResult);
        System.out.println("Second Result = " + secondResult);
        System.out.println("Third Result = " + thirdResult);
    }

}
