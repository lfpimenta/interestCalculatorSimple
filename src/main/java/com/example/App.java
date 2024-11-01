package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter loan amount: ");
            double loanAmount = scanner.nextDouble();

            System.out.print("Enter annual interest rate (%): ");
            double interestRate = scanner.nextDouble();

            System.out.print("Enter loan term (years): ");
            int loanTermYears = scanner.nextInt();

            HouseLoanCalculator calculator = new HouseLoanCalculator(loanAmount, interestRate, loanTermYears);

            double monthlyPayment = calculator.calculateMonthlyPayment();
            double totalCost = calculator.calculateTotalCost();

            System.out.println("Monthly payment: " + monthlyPayment);
            System.out.println("Total cost: " + totalCost);
        }
    }
}
