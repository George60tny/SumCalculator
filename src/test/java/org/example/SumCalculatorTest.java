package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    void testSum1() {
        int result = calculator.sum(1);
        assertEquals(1, result, "The sum of 1 should be 1");
    }

    @Test
    void testSum3() {
        int result = calculator.sum(3);
        assertEquals(6, result, "The sum of numbers up to 3 should be 6");
    }

    @Test
    void testSum0() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0), "Sum of numbers up to 0 should throw IllegalArgumentException");
    }
}