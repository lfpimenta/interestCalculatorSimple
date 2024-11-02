package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        double loanAmount;
        double interestRate;
        int loanTermYears;

        try {

            if (args.length == 3) {
                // Get parameters from command line arguments
                loanAmount = Double.parseDouble(args[0]);
                interestRate = Double.parseDouble(args[1]);
                loanTermYears = Integer.parseInt(args[2]);
            } else {
                try (Scanner scanner = new Scanner(System.in)) {
                    System.out.print("Enter loan amount: ");
                    loanAmount = scanner.nextDouble();

                    System.out.print("Enter annual interest rate (%): ");
                    interestRate = scanner.nextDouble();

                    System.out.print("Enter loan term (years): ");
                    loanTermYears = scanner.nextInt();
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return;
        }

        HouseLoanCalculator calculator = new HouseLoanCalculator(loanAmount, interestRate, loanTermYears);

        double monthlyPayment = calculator.calculateMonthlyPayment();
        double totalCost = calculator.calculateTotalCost();

        System.out.println("Monthly payment: " + monthlyPayment);
        System.out.println("Total cost: " + totalCost);
    }
}
