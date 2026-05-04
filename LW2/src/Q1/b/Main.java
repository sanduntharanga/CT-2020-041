package Q1.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double X,Y,ANS;
        Scanner myScanner = new Scanner(System.in);
        //get input
        System.out.println("Enter X: ");
        X = myScanner.nextDouble();
        System.out.println("Enter Y: ");
        Y = myScanner.nextDouble();

        ANS = Math.sqrt(X+ (4*(Y*Y*Y)));

        System.out.println("Answer: " + ANS);
    }
}
