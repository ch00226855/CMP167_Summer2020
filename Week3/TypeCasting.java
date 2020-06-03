public class TypeCasting {

    public static void main(String[] args) {

        double myDouble = 9.5;
        int myInt;

        myInt = (int)myDouble;

        System.out.println("myDouble:" + myDouble);
        System.out.println("myInt:" + myInt);

        // -------------------
        myInt = 9;
        myDouble = myInt;
        System.out.println("myDouble:" + myDouble);
        System.out.println("myInt:" + myInt);

    }

}
