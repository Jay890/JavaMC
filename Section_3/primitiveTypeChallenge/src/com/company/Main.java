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
		System.out.println("Min Double Value " + myMinDoubleValue);
		System.out.println("Max Double Value " + myMaxDoubleValue);

		//int is the default for whole numbers in Java
		//double is the default for decimals in Java

		int myIntValue = 5 / 3;
//		float myFloatValue = (float) 2.2;
		float myFloatValue2 =  5f / 3f;
		double myDoubleValue = 5d / 3d;

		System.out.println("My Int value " + myIntValue);
		System.out.println("My float value " + myFloatValue2);
		System.out.println("My double value " + myDoubleValue);

		//challenge -> pound to kg
		double pound = 200d;
		double kilogram = pound * 0.453592d;
		System.out.println(pound + "pound to kg is " + kilogram);

		//note: for precise calculations like finance bigDecimal is used in Java
    }
}
