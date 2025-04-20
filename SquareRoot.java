//Manan Khanna
//AIML B3
//23070126156

package operations;

import exceptions.NegativeNumberException; // Import custom exception

public class SquareRoot {
    // Method to compute square root
    public static double sqrt(double a) throws NegativeNumberException {
        if (a < 0) { // Square root of negative number is not allowed
            throw new NegativeNumberException("Square root of negative number not allowed");
        }
        return Math.sqrt(a); // Return result using built-in method
    }
}

