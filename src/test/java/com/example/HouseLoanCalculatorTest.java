package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HouseLoanCalculatorTest {
    @Test
    public void testCalculateMonthlyPayment() {

        HouseLoanCalculator calculator = new HouseLoanCalculator(60016, 4.424, 26);
        double expectedMonthlyPayment = 324.06; 
        double actualMonthlyPayment = calculator.calculateMonthlyPayment();
        assertEquals(expectedMonthlyPayment, actualMonthlyPayment, 0.01); // Delta for small rounding errors
    }

    @Test
    public void testCalculateTotalCost() {
        HouseLoanCalculator calculator = new HouseLoanCalculator(60016, 4.424, 26);
        double expectedTotalCost = 101107.12;
        double actualTotalCost = calculator.calculateTotalCost();
        assertEquals(expectedTotalCost, actualTotalCost, 0.01); 

    }
}
