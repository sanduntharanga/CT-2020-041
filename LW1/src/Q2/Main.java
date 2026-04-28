package Q2;

import javax.swing.JFrame;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        String fullName = firstName + " " + lastName;

        JFrame frame = new JFrame();

        frame.setSize(800, 600);

        frame.setTitle(fullName);

        frame.setVisible(true);

    }

}
