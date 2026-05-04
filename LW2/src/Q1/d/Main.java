package Q1.d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        final double PI = 3.14;

        //get input
        System.out.print("Enter radius of the circle: ");
        double r = myScanner.nextDouble();

        //compute area
        double area = PI * Math.pow(r,2);

        System.out.println("Area : "+ area);
    }
}
