package Coding_Challenge;

public class Challenge2 {
    // Function to reverse the position of words in a sentence using recursion
    public static String reverseWords(String sentence) {
        // Base case: If the sentence is empty or contains only spaces, return it
        if (sentence.isEmpty() || sentence.trim().isEmpty()) {
            return sentence;
        }

        // Find the index of the first space in the sentence
        int firstSpaceIndex = sentence.indexOf(' ');

        // If no space is found, return the sentence itself
        if (firstSpaceIndex == -1) {
            return sentence;
        }

        // Extract the first word
        String firstWord = sentence.substring(0, firstSpaceIndex);

        // Extract the remaining sentence after the first space
        String remainingSentence = sentence.substring(firstSpaceIndex + 1);

        // Recursively call the function on the remaining sentence
        String reversedRemaining = reverseWords(remainingSentence);

        // Return the reversed sentence with the first word appended at the end
        return reversedRemaining + " " + firstWord;
    }

    public static void main(String[] args) {
        String sentence = "I am the best AutomationTester";
        String reversedSentence = reverseWords(sentence);
        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }
}
