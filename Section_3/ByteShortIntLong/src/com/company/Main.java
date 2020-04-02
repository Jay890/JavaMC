package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Min Value " + myMinIntValue);
        System.out.println("Integer Max Value " + myMaxIntValue);

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
    }
}
