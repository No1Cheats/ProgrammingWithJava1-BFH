package UnitTesting;

public class TaxCalculatorTester {
    private static final double EPSILON = 1e-6;
    private static boolean doesPass = true;

    /** Runs tests for single and married for all tax rates. */
    public static void main(String[] arg) {
        testSingleLowRate();
        testSingleHighRate();
        testMarriedLowRate();
        testMarriedHighRate();
        System.out.println(doesPass ? "PASS" : "FAIL");
    }

    private static void testSingleLowRate() {
        assertEquals(20000 * 0.10, TaxCalculator.calculateTax(20000.0, TaxCalculator.Status.SINGLE),
                EPSILON);

    }


    private static void testSingleHighRate(){
        assertEquals(32000 * 0.10 + 18000 * 0.25, TaxCalculator.calculateTax(50000.0, TaxCalculator.Status.SINGLE),
                EPSILON);
    }

    private static void testMarriedLowRate(){
        assertEquals(20000 * 0.10, TaxCalculator.calculateTax(20000.0, TaxCalculator.Status.MARRIED),
                EPSILON);
    }

    private static void testMarriedHighRate(){
        assertEquals(64000 * 0.10 + 16000 * 0.25, TaxCalculator.calculateTax(80000.0, TaxCalculator.Status.MARRIED),
                EPSILON);
    }

    // When using JUnit, we do not need to define this method anymore
    private static void assertEquals(double expected, double actual, double delta) {
        if (Math.abs(actual - expected) >= delta) {
            System.err.println("Test Failure! Expected: " + expected + ", actual: " + actual);
            doesPass = false;
            (new Exception()).printStackTrace(); // trick to show stack trace to identify failure
        }
    }
}
