package Q11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String text;
        String fName, lName, mName;
        List<Integer> indexes = new ArrayList<>();

        //get input
        System.out.print("Enter your Fullname (first middle last): ");
        text = myScanner.nextLine();

        int spaceCount=0;
        for (int i = 0; i < text.length(); i++) {
            if(spaceCount>2){
                break;
            }

            if(text.charAt(i) == ' '){
                spaceCount += 1;
                indexes.add(i);
            }
        }

        //error handeling
        if(spaceCount!=2){
            System.out.println("Invalid input!");
        } else {
            fName = text.substring(0,indexes.get(0));
            mName = text.substring((indexes.get(0)+1),indexes.get(1));
            lName = text.substring((indexes.get(1)+1));

            String nameToDisplay = lName + ", " + fName + " " + mName.charAt(0);

            System.out.println(nameToDisplay);
        }

    }
}
