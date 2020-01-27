package Lambda;

public class TestCalculator {

    /**
     * Main method.
     * @param args unused
     */
    public static void main(String[] args) {
        // Add
        System.out.println(LambdaCalculator.useLambda(5, 2, (i1, i2) -> i1 + i2));
        // Subtract
        System.out.println(LambdaCalculator.useLambda(5, 2, (i1, i2) -> i1 - i2));
        // Multiply
        System.out.println(LambdaCalculator.useLambda(5, 2, (i1, i2) -> i1 * i2));
    }


}
