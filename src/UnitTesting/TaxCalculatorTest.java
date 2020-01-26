package UnitTesting;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class TaxCalculatorTest {

    private static final double EPSILON = 1e-6;

    @Test
    void testCalculateTax() {
        assertEquals(20000 * 0.10, TaxCalculator.calculateTax(20000.0, TaxCalculator.Status.SINGLE),
                EPSILON);
        assertEquals(32000 * 0.10 + 18000 * 0.25, TaxCalculator.calculateTax(50000.0, TaxCalculator.Status.SINGLE),
                EPSILON);
        assertEquals(20000 * 0.10, TaxCalculator.calculateTax(20000.0, TaxCalculator.Status.MARRIED),
                EPSILON);
        assertEquals(64000 * 0.10 + 16000 * 0.25, TaxCalculator.calculateTax(80000.0, TaxCalculator.Status.MARRIED),
                EPSILON);
    }
}
