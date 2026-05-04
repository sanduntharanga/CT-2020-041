package Q3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (1.8 * celsius) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

    }

}
