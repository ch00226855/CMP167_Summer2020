import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {

        String name = "Alice";
        double gpa = 3.5;
        int age = 20;

        System.out.printf("%d - %s", age, name);

        System.out.printf("%f%% %d\n", gpa, age);

        int myInt = -713;
        System.out.printf("%+04d\n", myInt);

        System.out.printf("%05d\n", myInt);

        float myFloat = 45.1342f;
        System.out.printf("%+.5f\n", myFloat);

        String myString = "Monday";
        System.out.printf("%-8s\n", myString);

        String myStr = "Age: 20";
        Scanner inSS = new Scanner(myStr);
        inSS.next();
        int ageVal = inSS.nextInt();
        System.out.println(ageVal);

    }
}
