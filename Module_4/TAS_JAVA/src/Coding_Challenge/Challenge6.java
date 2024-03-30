package Coding_Challenge;

import java.util.Arrays;

public class Challenge6 {
    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove whitespace and convert to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Sort the characters of both strings
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted strings
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String inputString = "Despite commuting at the peek hour, she was able to keep totime";

        // Split the input string into individual words
        String[] words = inputString.split("\\s+");

        // Check for anagrams
        System.out.println("Anagrams in the input string:");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (areAnagrams(words[i], words[j])) {
                    System.out.println(words[i] + " and " + words[j]);
                }
            }
        }
    }
}
