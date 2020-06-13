public class MethodDemo {
    
    public static void main(String[] args) {
        
        // call method printHello()
        printHello();

        // call sayHelloTo() to say hello to John
        sayHelloTo("John"); // "John" is the method argument

        // someoneSayHelloTo() to say hello to someone from someone else
        someoneSayHelloTo("Mike", "John");
        someoneSayHelloTo("John", "Mike");

        // use getEMPLID()
        // if a method returns something, we need to catch it
        int emplID;
        // emplID = getEMPLID();
        emplID = getJohnEMPLID(); 
        System.out.println("The next EMPL ID is: " + (emplID + 1));
        if (emplID > 100000) {
            System.out.println("This is a professor.");
        } else {
            System.out.println("This is a student.");
        }

        // String myName = getMyName();
        sayHelloTo(getMyName()); // use the name returned by getMyName() as argument
        someoneSayHelloTo("Mike", getMyName());
        String mikeName = "Mike";
        String johnName = "John";
        someoneSayHelloTo(mikeName, johnName);
        // MISTAKE: someoneSayHelloTo(String mikeName, String johnName);

        System.out.println("Do this after method call.");

        //-----------------------
        // Calculate area of 12-inch and 16-inch pizza
        // double area12InchPizza = getPizzaArea(12.0); // use getPizzaArea to do the calculation
        // double area16InchPizza = getPizzaArea(16.0);
        // System.out.println("The area of a 12-inch pizza is: " + area12InchPizza);
        // System.out.println("The area of a 16-inch pizza is: " + area16InchPizza);
        // OR 
        System.out.println("The area of 12\" of a pizza is: " + getPizzaArea(12.0) );
        System.out.println("The area of 16\" of a pizza is: " + getPizzaArea(16.0) );

    }

    public static void printHello() {
        System.out.println("Hello!");
    }

    // write method sayHelloTo() to print "Hello, ***!"
    public static void sayHelloTo(String name) { // name is the method parameter
        System.out.println("Hello, " + name + "!");
    }

    public static void someoneSayHelloTo(String nameFrom, String nameTo) {
        System.out.println(nameFrom + " says: Hello, " + nameTo + "!");
    }

    // Write a method named getEMPLID() that returns the EMPLID whenever it is called.
    // DONT WRITE LIKE THIS:
    // public static void getEMPLID() {
    //     System.out.println(123456);
    // }
    public static int getEMPLID() {
        return 123456; // returns to the place where the method is called.
    }

    public static int getJohnEMPLID() {
        return 54321;
    }

    public static String getMyName() {
        return "Liang";
    }

    // Write a method printPizzaArea that calculates the area of a pizza with given
    //  diameter. Use this method to calculate the area of a 12-inch pizza and a 
    // 16-inch pizza.
    // Formula: 
    // radius = diameter / 2
    // area = pi * radius * radius
    public static double getPizzaArea(double diameter) {
        double radius = diameter / 2.0;
        double circleArea = Math.PI * Math.pow(radius, 2);
        return circleArea;
    }


}