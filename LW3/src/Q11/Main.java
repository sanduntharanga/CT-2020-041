package Q11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int)(Math.random() * 100) + 1;

        int guess = 0;

        System.out.println("I have a number between 1 and 100. Try to guess it!");

        while (guess != randomNumber) {

            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too low! Try higher.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try lower.");
            } else {
                System.out.println("Correct! The number was " + randomNumber);
            }

        }

    }

}
