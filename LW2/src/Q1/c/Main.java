package Q1.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double X,Y,ANS;
        Scanner myScanner = new Scanner(System.in);
        //get input
        System.out.print("Enter X: ");
        X = myScanner.nextDouble();
        System.out.print("Enter Y: ");
        Y = myScanner.nextDouble();

        ANS = Math.cbrt(X*Y);

        System.out.println("Answer: " + ANS);
    }
}
