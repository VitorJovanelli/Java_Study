public class PrimitiveTypesIntAndWrapperClass {

    public static void main(String[] args) {
        /*Whole number
        byte
        short
        int
        long

        Real number
        float
        double

        Single character
        char

        Boolean value
        boolean
         */

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;  //-2147483648
        int myMaxIntValue = Integer.MAX_VALUE;  //2147483647

        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Integer maximum value = " + myMaxIntValue);

        System.out.println("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");

        /*
        Wrapper Classes
        byte --> Byte
        short --> Short
        char --> Character
        int --> Integer
        long --> Long
        float --> Float
        double --> Double
        boolean --> Boolean
         */

        System.out.println("Busted max value = " + (myMaxIntValue + 1));    //Overflow
        System.out.println("Busted min value = " + (myMaxIntValue -1));     //Underflow

        //int myMaxIntTest = 2147483648; Error

        int myMaxIntTest = 2_147_483_647;
    }

}
