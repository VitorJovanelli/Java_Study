public class FirstChallenge {

    public static void main(String[] args) {
        /*
        Your challenge is to crete four new variables:
        1) A byte variable, set it to any valid byte number
        2) A short variable, set it to any valid short number
        3) An int variable, set it to any valid int number

        Lastly, create a variable of type long. Make it equal to 50_000
        plus 10 times the sum of the values of the first 3 variables.
         */

        byte myByteNumber = 7;
        short myShortNumber = 15;
        int myIntNumber = 126;
        long myTotal = (long) (myIntNumber + myByteNumber + myShortNumber);

        long myLongNumber = (long) (50_000 + (10 * (myIntNumber + myByteNumber + myShortNumber)));
        myLongNumber = (long) (50_000 + (10 * myTotal));
        myLongNumber = (50_000L + (10 * myTotal));

        System.out.println("My long number is: " + myLongNumber);
    }

}
