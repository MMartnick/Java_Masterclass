package com.mattMartnick;

public class Main {

    public static void main(String[] args) {
	// Operators are special symbols that perform specific operations
        // on 1,2, or 3 operands and then return specific results

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        // % Returns the remainder of the division of integers
        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        System.out.println("                    ");

        // ++ increments an integer by plus one
        result = 10;
        result++;
        System.out.println(" Result is " + result);

        // -- increments an integer by minus one
        result = 10;
        result--;
        System.out.println(" Result is " + result);

        System.out.println("                    ");

        // Operator shortcuts
        result = 10;
        result += 2;
        System.out.println(" 10 += 2: " + result);

        result = 10;
        result -= 2;
        System.out.println(" 10 -= 2: " + result);

        result = 10;
        result *= 2;
        System.out.println(" 10 *= 2: " + result);

        result = 10;
        result /= 2;
        System.out.println(" 10 /= 2: " + result);

        result = 10;
        result %= 2;
        System.out.println(" 10 %= 2: " + result);

        System.out.println("                    ");

        // if/else statements
        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien");

        int topScore = 100;
        if (topScore == 100)
            System.out.println("You got the high score!");


    }
}
