package Q9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter principal amount: ");
        double P = scanner.nextDouble();

        System.out.println("Enter interest rate : ");
        double R = scanner.nextDouble();

        System.out.println("Enter number of years: ");
        int N = scanner.nextInt();

        double amount = P * Math.pow(1 + (R / 100), N);

        System.out.println("Amount after " + N + " years: " + amount);

    }

}