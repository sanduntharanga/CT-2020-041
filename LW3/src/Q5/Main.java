package Q5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] entreeNames = {"Tofu Burger", "Cajun Chicken", "Buffalo Wings", "Rainbow Fillet"};
        double[] entreePrices = {3.49, 4.59, 3.99, 2.99};

        String[] sideNames = {"Rice Cracker", "No-Salt Fries", "Zucchini", "Brown Rice"};
        double[] sidePrices = {0.79, 0.69, 1.09, 0.59};

        String[] drinkNames = {"Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"};
        double[] drinkPrices = {1.99, 1.90, 2.49, 0.99};

        String[] orderedItems = new String[100];
        double[] orderedPrices = new double[100];
        int[] orderedQuantities = new int[100];
        int orderCount = 0;

        boolean running = true;

        while (running) {

            System.out.println("\n--- MENU CATEGORIES ---");
            System.out.println("1. Entree");
            System.out.println("2. Side Dish");
            System.out.println("3. Drink");
            System.out.println("4. Exit and Print Bill");
            System.out.println("Select a category: ");

            int category = scanner.nextInt();

            if (category == 4) {
                running = false;
            } else {

                String[] names = {};
                double[] prices = {};

                if (category == 1) {
                    names = entreeNames;
                    prices = entreePrices;
                } else if (category == 2) {
                    names = sideNames;
                    prices = sidePrices;
                } else if (category == 3) {
                    names = drinkNames;
                    prices = drinkPrices;
                }

                System.out.println("\n--- ITEMS ---");
                for (int i = 0; i < names.length; i++) {
                    System.out.println((i + 1) + ". " + names[i] + " $" + prices[i]);
                }

                System.out.println("Select item number: ");
                int itemChoice = scanner.nextInt() - 1;

                System.out.println("Enter quantity: ");
                int quantity = scanner.nextInt();

                orderedItems[orderCount] = names[itemChoice];
                orderedPrices[orderCount] = prices[itemChoice];
                orderedQuantities[orderCount] = quantity;
                orderCount++;

                System.out.println(names[itemChoice] + " x" + quantity + " added to order!");

            }

        }

        System.out.println("\n--- ORDER SUMMARY ---");
        double total = 0;

        for (int i = 0; i < orderCount; i++) {
            double subtotal = orderedPrices[i] * orderedQuantities[i];
            total = total + subtotal;
            System.out.println(orderedItems[i] + " x" + orderedQuantities[i] + " @ $" + orderedPrices[i] + " = $" + subtotal);
        }

        System.out.println("TOTAL: $" + total);

    }

}