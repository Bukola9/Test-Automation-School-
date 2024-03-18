package Tasks;

import java.util.Scanner;

public class Task_9B {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize a variable to store user input
        String userInput;

        // Prompt the user to enter input and keep looping until "testify" is entered
        do {
            // Prompt the user to enter input
            System.out.print("Enter input: ");
            userInput = scanner.nextLine();

            // Check if user input is not "testify", then print "try again"
            if (!userInput.equals("testify")) {
                System.out.println("Try again");
            }
        } while (!userInput.equals("testify"));

        // Close the scanner
        scanner.close();

        // Print message after exiting the loop
        System.out.println("Thank you for entering 'testify'");
    }
}
