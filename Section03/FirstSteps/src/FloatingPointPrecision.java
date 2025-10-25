public class FloatingPointPrecision {

    public static void main(String[] args) {

        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;

        myIntValue = 5/2; //2
        myFloatValue = 5f/2f; //2.5
        myDoubleValue = 5d/2d; //2.5

        myIntValue = 5/3; //1
        myFloatValue = 5f/3f; //1.6666666
        myDoubleValue = 5d/3d; //1.6666666666666667
        myDoubleValue = 5.00/3.00; //1.6666666666666667
        myDoubleValue = 5.00/3;
        //myFloatValue = 5.00/3; ERROR

        double givenNumberOfPounds = 200d;
        double numberConvertedToKilograms = givenNumberOfPounds * 0.45359237d;
        System.out.println(givenNumberOfPounds + " pounds in kilograms is " + numberConvertedToKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;

    }

}
