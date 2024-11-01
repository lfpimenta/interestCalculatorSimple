package com.example;

public class HouseLoanCalculator {
    private double loanAmount;
    private double interestRate;
    private int loanTermYears;

    public HouseLoanCalculator(double loanAmount, double interestRate, int loanTermYears) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTermYears = loanTermYears;
    }

    public double calculateMonthlyPayment() {
        double monthlyInterestRate = interestRate / 12 / 100; // Convert annual rate to monthly
        int numberOfPayments = loanTermYears * 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        return monthlyPayment;
    }

    public double calculateTotalCost() {
        double monthlyPayment = calculateMonthlyPayment();
        int numberOfPayments = loanTermYears * 12;
        double totalCost = monthlyPayment * numberOfPayments;
        return totalCost;
    }
}
