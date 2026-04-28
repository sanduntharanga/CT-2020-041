package Q10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String text;

        //get input
        System.out.print("Enter your text: ");
        text = myScanner.nextLine();

        int textLength = text.length();

        if(textLength%2 == 1){
            System.out.println(text.charAt((textLength/2)));
        } else {
            System.out.println("Invalid input!");
        }
    }
}