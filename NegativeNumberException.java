package exceptions;

// Custom exception class for invalid square root
public class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
