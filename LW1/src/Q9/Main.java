package Q9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int length = sentence.length();

        char firstChar = sentence.charAt(0);

        char lastChar = sentence.charAt(length - 1);

        System.out.println(length);
        System.out.println(firstChar);
        System.out.println(lastChar);

    }

}