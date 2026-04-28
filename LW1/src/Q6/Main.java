package Q6;

import javax.swing.JFrame;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width: ");
        int width = scanner.nextInt();

        System.out.println("Enter the height: ");
        int height = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter the title: ");
        String title = scanner.nextLine();

        JFrame frame = new JFrame();

        frame.setSize(width, height);

        frame.setTitle(title);

        frame.setVisible(true);

    }

}