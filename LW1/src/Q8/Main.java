package Q8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int breakIndex=0;
        int spaceBreaker;

        //get input
        System.out.print("Enter your text with exclamation mark: ");
        String text = myScanner.nextLine();


        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)=='!') {
                breakIndex = i;
                break;
            }
        }

        if (breakIndex != 0) {
            spaceBreaker = breakIndex+1;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(spaceBreaker) == ' ') {
                    spaceBreaker += 1;
                }
            }
            String outputText = text.substring(0,breakIndex) + "\n" + text.substring(spaceBreaker, text.length());
            System.out.println(outputText);
        } else {
            System.out.println("Your Text hasn't a exclamation mark(!).");
        }
    }
}
