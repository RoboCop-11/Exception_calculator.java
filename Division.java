package operations; // Your current package

import exceptions.DivisionByZeroException; // ✅ Import custom exception

public class Division {
    // Method to perform division
    public static double divide(double a, double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Cannot divide by zero");
        }
        return a / b;
    }
}
