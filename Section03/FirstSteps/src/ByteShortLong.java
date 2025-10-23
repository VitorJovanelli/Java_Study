public class ByteShortLong {

    public static void main(String[] args) {

        System.out.println("Byte value range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short value range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Long value range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        /*
        Size of primitve types and width
        Byte --> 8 bits (1 byte)
        Short --> 16 bits (2 bytes)
        Integer --> 32 bits (4 bytes)
        Long --> 64 bits (8 bytes)
         */

        long myLongValue = 100L;

        System.out.println("A long has a width of " + Long.SIZE);

        myLongValue = 100;

        long bigLongLiteralValue = 2_147_483_647;
        //bigLongLiteralValue = 2_147_483_648; Error
        bigLongLiteralValue = 2_147_483_648L;

        //short bigShortLiteralValue = 32768; Error
        short bigShortLiteralValue = 32767;
    }

}
