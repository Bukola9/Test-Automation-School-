package Tasks;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Task_10 testifyVisitor = new Task_10();
        Task_10.verifySlack();

    }
    public static void verifySlack(){
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do {
            // Prompt the user to enter input
            System.out.print("Enter input: ");
            userInput = scanner.nextLine();

            // Check if user input is not "testify", then print "try again"
            if (userInput.equals("testify")) {
                System.out.println("Welcome to testify ");
            }
        } while (!userInput.equals("try again later"));

        // Close the scanner
        scanner.close();


    }


    }
