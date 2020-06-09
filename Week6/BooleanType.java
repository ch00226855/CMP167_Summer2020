public class BooleanType {

    public static void main(String[] args) {

        // 8 primitive data types:
        // 4 integer types: byte, short, int (+- 2 billion), long
        // 2 decimal types: float (7 decimal digits), double (15 decimal digits)
        // char - character
        // boolean - true or false
        boolean var1 = true;
        boolean var2 = false;

        System.out.println(var1);

        System.out.println(var2);

        boolean var3 = var1 && var2;
        boolean var4 = var1 || var2;
        boolean var5 = !var1;

        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);

        // break down a long expression with boolean variables
        // !((x > 5) && (y < 20))
        System.out.println("-----------------------");
        int x = 7;
        int y = 9;
        boolean xPart = (x > 5);
        boolean yPart = (y < 20);
        boolean andPart = xPart && yPart;
        boolean notPart = !andPart;
        System.out.println(notPart);

        //
    }
}
