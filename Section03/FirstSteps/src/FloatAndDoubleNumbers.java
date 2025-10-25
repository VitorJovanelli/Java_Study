public class FloatAndDoubleNumbers {

    public static void main(String[] args) {
    /*
    float 32bits
    double 64bits
     */

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double value range: " + myMinDoubleValue + " to " + myMaxDoubleValue);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float value range: " + myMinFloatValue + " to " + myMaxFloatValue);

        int myIntValue = 5;
        float myFloatValue = 5;
        double myDoubleValue = 5;

        myDoubleValue = 5d;
        myFloatValue = 5f;

        //float myOtherFloatValue = 5.25; ERROR
        float myOtherFloatValue = 5.25f;
        float myOtherFloatingValue = (float) 5.25;
    }
}
