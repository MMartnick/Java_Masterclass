package com.mattMartnick;

public class Main {

    public static void main(String[] args) {

        // A string is a sequence of characters

        String myString = "This is a string";
        String uniString = "\u00A9 2019";
        System.out.println("mystring is equal to: " + myString + ". " + uniString);

        String numString = "250.55";
        numString = numString + "49.95";
        System.out.println(numString);
        // Like JS a number in a string reads only as a string and can not solve equations

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNum = 120.47;
        lastString = lastString + doubleNum;
        System.out.println("LastString value: " + lastString);

    }
}
