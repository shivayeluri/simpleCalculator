import logic.*;

public class SimpleCalculator {
    public static void main(String[] args) {
       new Addition().addingNumbers(args);
       new Subtraction().subtractingNumbers(args);
       new Multiplication().multiplyingNumbers(args);
       new Modulus().Modulus(args);
       new Division().divideNumbers(args);
    }
}