import java.util.Scanner; // Scanner for user input
import operations.*; // Import all operation classes
import exceptions.*; // Import custom exceptions

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object for input

        try {
            // Display options to the user
            System.out.println("==== Calculator Application ====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt(); // Read user's choice

            System.out.print("Enter first number: ");
            double a = sc.nextDouble(); // Read first number

            double b = 0; // Initialize second number
            if (choice >= 1 && choice <= 4) { // For operations needing 2 numbers
                System.out.print("Enter second number: ");
                b = sc.nextDouble(); // Read second number
            }

            double result = 0; // Initialize result

            // Switch case for different operations
            switch (choice) {
                case 1:
                    result = Addition.add(a, b);
                    break;
                case 2:
                    result = Subtraction.subtract(a, b);
                    break;
                case 3:
                    result = Multiplication.multiply(a, b);
                    break;
                case 4:
                    result = Division.divide(a, b);
                    break;
                case 5:
                    result = Square.square(a);
                    break;
                case 6:
                    result = Cube.cube(a);
                    break;
                case 7:
                    result = SquareRoot.sqrt(a);
                    break;
                default:
                    System.out.println("Invalid choice");
                    return;
            }

            System.out.println("Result: " + result); // Display result
        } catch (DivisionByZeroException | NegativeNumberException e) {
            System.out.println("Custom Exception: " + e.getMessage()); // Handle custom exceptions
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Built-in Exception: " + e.getMessage()); // Handle built-in exceptions
        } catch (Exception e) {
            System.out.println("Unknown error: " + e.getMessage()); // Catch-all for safety
        } finally {
            sc.close(); // Close scanner to avoid resource leak
        }
    }
}
