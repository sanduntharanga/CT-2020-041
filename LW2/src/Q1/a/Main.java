package Q1.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double A,C,B,answer;
        Scanner myScanner = new Scanner(System.in);
        //get inputs
        System.out.print("Enter A: ");
        A = myScanner.nextDouble();
        System.out.print("Enter B: ");
        B = myScanner.nextDouble();
        System.out.print("Enter C: ");
        C = myScanner.nextDouble();


        answer = Math.sqrt(((B*B) + (4*A*C)));
        System.out.println("Answer: " + answer);

    }
}
