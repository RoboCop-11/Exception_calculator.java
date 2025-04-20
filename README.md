Here’s a simple README for your calculator project:

---

# Calculator with Exception Handling

This is a basic calculator application built in Java. It implements several arithmetic operations including addition, subtraction, multiplication, division, square, cube, and square root. The program uses custom exceptions to handle specific error cases, as well as inbuilt exceptions for general error handling.

## Features:
- **Addition**
- **Subtraction**
- **Multiplication**
- **Division** (with exception for division by zero)
- **Square** (of a number)
- **Cube** (of a number)
- **Square Root** (with validation for negative numbers)

## Exceptions Used:
### Inbuilt Exceptions:
1. **ArithmeticException** - Handles division by zero and other arithmetic errors.
2. **NumberFormatException** - Handles invalid number format when input is not a valid number.

### Custom Exceptions:
1. **DivisionByZeroException** - Handles the specific case of dividing by zero.
2. **NegativeNumberException** - Handles the case of trying to compute the square root of a negative number.

## Project Structure:
```
CalculatorExceptions/
│
├── src/
│   ├── exceptions/
│   │   ├── DivisionByZeroException.java
│   │   ├── NegativeNumberException.java
│   │   
│   └── operations/
│       ├── Addition.java
│       ├── Subtraction.java
│       ├── Multiplication.java
│       ├── Division.java
│       ├── Square.java
│       ├── Cube.java
│       └── SquareRoot.java
└── Main.java
```

## Usage:
1. Compile the Java files:
   ```bash
   javac src/exceptions/*.java src/operations/*.java Main.java
   ```

2. Run the `Main` class:
   ```bash
   java Main
   ```

3. The program will display a menu with the following options:
   - Add, Subtract, Multiply, Divide, Square, Cube, Square Root.
   - Choose the operation and enter the required numbers.

4. If an error occurs (e.g., division by zero, square root of a negative number), the appropriate exception will be thrown and displayed.
