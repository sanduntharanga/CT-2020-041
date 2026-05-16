package Q1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Enter third number: ");
        int c = scanner.nextInt();

        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }

        if (c < smallest) {
            smallest = c;
        }

        System.out.println("The smallest number is: " + smallest);

    }

}