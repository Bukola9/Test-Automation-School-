package Tasks;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // the rate of interest
        System.out.print("Enter the annual interest rate (%): ");
        double rate = scanner.nextDouble();

        // the duration in years
        System.out.print("Enter the duration in years: ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Communicate the simple interest back to the user
        System.out.println("The simple interest is: " + simpleInterest);

        // Close the scanner
        scanner.close();
    }
}
