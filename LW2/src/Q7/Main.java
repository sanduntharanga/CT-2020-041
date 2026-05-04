package Q7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int weight , height, bmi;
        String message, color, red="\u001b[31m", green="\u001b[32m", reset = "\u001b[0m";

        //get input
        System.out.print("Weight(kg) : ");
        weight = myScanner.nextInt();
        System.out.print("Height(cm) : ");
        height = myScanner.nextInt();

        //compute
        bmi = weight / (int)(Math.pow((height/100.0), 2));
        if(bmi>=20 && bmi<=25){
            message = "Normal";
        } else if (bmi<20) {
            message = "Underweight";
        } else {
            message = "Overweight";
        }
        color = (bmi<=25 && bmi>=20) ? green : red;
        System.out.printf("BMI = %d (%s%s%s).", bmi, color, message, reset);
    }
}
