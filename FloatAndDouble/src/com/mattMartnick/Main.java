package com.mattMartnick;

public class Main {

    public static void main(String[] args) {
        // Double data type has twice as much data as Float

        // Int as a whole number does not retain any remainders
        int myIntValue = 5;

        // Float will give decimals up to 7 digits of precision
        float myFloatValue = 5f;

        // Double will give decimals up to  digits of precision
        double myDoubleValue = 5d;

        System.out.println( "myIntValue = " + myIntValue);
        System.out.println( "myFloatValue = " + myFloatValue);
        System.out.println( "myDoubleValue = " + myDoubleValue);


        // Challenge: Convert a number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of kilograms for the number above and store in a variable
        // 3. Print out the result
        //
        // One pound is equal to 45359237 kilograms

        double totalPounds = 200d;
        double conversion = totalPounds * 0.45359237d;

        System.out.println( totalPounds + " pounds is equal to " +  conversion + " kilograms.");

        double pi = 3.1415927d;

    }
}


