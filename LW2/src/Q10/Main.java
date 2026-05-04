package Q10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double loanAmount, annualInterestRate, loanPeriod;
        Scanner myScanner = new Scanner(System.in);


        System.out.print("Loan amount:");
        loanAmount = myScanner.nextDouble();
        System.out.print("Annual interest rate: ");
        annualInterestRate = myScanner.nextDouble();
        System.out.print("Loan time period: ");
        loanPeriod = myScanner.nextDouble();

        double monthlyInterestRate = annualInterestRate / 100.0 / 12.0;
        double numberOfPayments = loanPeriod * 12.0;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        double totalPayment = monthlyPayment * numberOfPayments;


        System.out.printf("Paments:\n\tMonthly payment: \t%.2f\n\tTotal payment: \t\t%.2f", monthlyPayment, totalPayment);
    }
}