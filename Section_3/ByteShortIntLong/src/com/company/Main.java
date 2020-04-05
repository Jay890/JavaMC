package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Min Value " + myMinIntValue );
        System.out.println("Integer Max Value " + myMaxIntValue );

        //Now that we have established the maximum int value
        //What happens if we plus 1 to that value
        System.out.println("Busted MAX Value " +( myMaxIntValue + 1 ));
        //Results in a negative number (minimum int number) an this is called an Overflow

        System.out.println("Busted MIN value " + ( myMinIntValue - 1));
        //Results in a positive number (maximum int number) an this is called an underflow

        //we can use underscore to make more readable
        int LongNumber = 21_4563_243;
        System.out.println(LongNumber);
        //prints out 214563243

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Min value byte " + myMinByteValue );
        System.out.println("Max value byte " + myMaxByteValue );

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Min value Short " + myMinShortValue );
        System.out.println("Max value Short " + myMaxShortValue );

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Min value Long " + myMinLongValue );
        System.out.println("Max value Long " + myMaxLongValue );

        //creating a long value, requires an l at the end
        long myLongValue = 1000L;
        System.out.println(myLongValue);

        int myTotal = (myMinIntValue) / 2;
        System.out.println(myTotal);

        //get an error here as we byteTotal looking for byte but getting an int as we are dividing by an int
       // byte byteTotal = (myMinByteValue) / 2;
        //we can use casting to get around this error
        byte byteTotal = (byte)(myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);
        var test1 = "2";
        var test2 = 1;
        System.out.println(Integer.parseInt((test1)) + test2);

    }
}
