package com.company;

public class Main {

    public static void main(String[] args) {
	    byte validByte = (byte) 1000;
	    short validShort = (short) 500;
	    int validInt = 99;
	    long validLong = 50_000L + (10L * (validByte + validShort + validInt));

        System.out.println(validLong);
    }
}
