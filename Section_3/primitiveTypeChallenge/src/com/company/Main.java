package com.company;

public class Main {

    public static void main(String[] args) {
	    byte validByte = (byte) 1000;
	    short validShort = (short) 500;
	    int validInt = 99;
	    long validLong = 50_000L + (10L * (validByte + validShort + validInt));

        System.out.println(validLong);

        //float - single precision type
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		//double - double precision type
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;

		System.out.println("Min Float Value: " + myMinFloatValue);
		System.out.println("Max Float Value " + myMaxFloatValue);
		System.out.println("Min Double Vlaue " + myMinDoubleValue);
		System.out.println("Max Double Value " + myMaxDoubleValue);

		//int is the default for whole numbers in Java
		//double is the default for decimals in Java

		int myIntValue = 2;
//		float myFloatValue = (float) 2.2;
		float myFloatValue2 =  2.2f;
		double myDoubleValue = 2.2d;

		//challenge

    }
}
