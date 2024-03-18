package Tasks;

public class Task_9a {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                System.out.println(i + " is odd");
            } else { // Otherwise, the number is even
                System.out.println(i + " is even");
            }
        }
    }
}
