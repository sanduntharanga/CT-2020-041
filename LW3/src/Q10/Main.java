package Q10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word or phrase: ");
        String input = scanner.nextLine();

        String cleaned = input.toLowerCase().replaceAll(" ", "");

        String reversed = "";

        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed = reversed + cleaned.charAt(i);
        }

        if (cleaned.equals(reversed)) {
            System.out.println(input + " is a Palindrome!");
        } else {
            System.out.println(input + " is Not a Palindrome!");
        }

    }

}