package Q7;

import java.util.Scanner;

public class Main {

    public static int countDigits(int number) {

        if (number < 0) {
            number = -number;
        }

        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        return count;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number (negative to stop): ");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            int digits = countDigits(number);
            System.out.println("Number of digits: " + digits);

        }

    }

}