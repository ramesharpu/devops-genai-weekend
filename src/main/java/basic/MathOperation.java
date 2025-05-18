package basic;

/**
 * A utility class that provides basic mathematical operations such as 
 * addition, subtraction, multiplication, and division.
 */
public class MathOperation {

    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts one integer from another.
     *
     * @param a the number to subtract from
     * @param b the number to subtract
     * @return the result of a minus b
     */
    public int sub(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    public int mul(int a, int b) {
        return a * b;
    }

    /**
     * Divides one integer by another.
     * Throws an ArithmeticException if division by zero is attempted.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the result of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
