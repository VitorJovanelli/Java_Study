public class CharAndBooleanPrimitiveData {

    public static void main(String[] args) {

        char myChar = 'D';
        //char anotherChar = 'DD'; ERROR

        char myUnicode = '\u0044';
        char myDecimalCode = 68;

        char myNewChar = '?';
        char myNewUnicode = '\u003F';
        char myNewDecimalCode = 63;

        System.out.println("My values are" + myNewChar + myNewDecimalCode + myNewUnicode);

        boolean myFalseBoolean = false;
        boolean myTrueBoolean = true;

        boolean isCustomerOver23Years = true;
    }

}
