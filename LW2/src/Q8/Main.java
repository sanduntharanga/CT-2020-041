package Q8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double radius=0, volume;
        String input;
        boolean isValid = false;

        final double PI = 3.14;

        while (!isValid) {
            //get input
            System.out.print("Radius : ");
            input = myScanner.nextLine();

            //check is valid input
            try {
                radius = Double.parseDouble(input);
                if (radius <= 0) {
                    System.out.println("Radius cannot be less or eqal to 0!\n");
                } else {
                    isValid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!\n");
            }
        }

        //compute
        volume = (4.0/3.0) * PI * Math.pow(radius, 3);

        //display
        System.out.printf("Volume of sphere: %.2f", volume);
    }
}