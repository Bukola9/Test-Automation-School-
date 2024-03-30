package Coding_Challenge;

public class Challenge7 {
    public static String reverseString(String str) {
        // Base case: If the string is empty or has only one character, return it as is
        if (str == null || str.length() <= 1) {
            return str;
        }

        // Recursive step: Reverse the substring from index 1 to the end and concatenate the first character
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "TestifyAutomation";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
