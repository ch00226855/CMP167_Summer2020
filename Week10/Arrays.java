public class Arrays {

    public static void main(String[] args) {
        
        String[] names = new String[5];

        // refer to an element by names[index] 
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        names[3] = "David";
        names[4] = "Eva";
        // Don't using out-of-bound index
        // names[5] = "Fred";

        System.out.println("The first name: " + names[0]);
        System.out.println("The second name: " + names[1]);
        System.out.println("The third name: " + names[2]); 
        // don't access a variable before assigning a value to it
        int indexIWant = 0;
        System.out.println("Name at index " + indexIWant + ": " +
                        names[indexIWant]);

        

    }
    
}