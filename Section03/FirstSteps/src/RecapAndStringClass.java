public class RecapAndStringClass {

    public static void main(String[] args) {

        String myString = "Tris is a string";

        System.out.println("myString is equal to " + myString);

        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);

        myString = "I wish I had \u00241,000,000.00";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.45";
        System.out.println(numberString);

        //int myInt = "10"; ERROR

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

        double myDouble = 120.47;
        lastString = lastString + myDouble;
        System.out.println(lastString);

    }

}
