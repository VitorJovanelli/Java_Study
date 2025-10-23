public class CastingWithNumericPrimitive {

    public static void main(String[] args) {

        short myMinShortValue = Short.MIN_VALUE; int myMinIntValue = Integer.MIN_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;
        //short firstShort = 1, int firstInteger = 2; Error
        short firstShort = 1; int firstInteger = 2;
        //byte firstByte = 1, byte secondByte = 2; Error
        byte firstByte = 1; byte secondByte = 2;

        int myTotal = (myMinIntValue / 2);

        //byte myNewByteValue = (myMinByteValue / 2); Error
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

    }

}
