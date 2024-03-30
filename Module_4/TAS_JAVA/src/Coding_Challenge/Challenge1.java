package Coding_Challenge;

public class Challenge1 {
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        // Initialize pointers for the beginning and end of the string
        int left = 0;
        int right = str.length() - 1;

        // Loop until the pointers meet
        while (left < right) {
            // Ignore non-alphanumeric characters from the left
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            // Ignore non-alphanumeric characters from the right
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            // Compare characters at the pointers
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, not a palindrome
            }

            // Move pointers towards each other
            left++;
            right--;
        }

        return true; // If the loop completes, it's a palindrome
    }

    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "10801";

        if (isPalindrome(str1)) {
            System.out.println(str1 + " is a palindrome.");
        } else {
            System.out.println(str1 + " is not a palindrome.");
        }

        if (isPalindrome(str2)) {
            System.out.println(str2 + " is a palindrome.");
        } else {
            System.out.println(str2 + " is not a palindrome.");
        }
    }
}
