package Coding_Challenge;

import java.util.*;

public class Challenge5 {
    public static List<List<String>> createAnagramBuckets(String[] words) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        // Iterate through each word in the input array
        for (String word : words) {
            // Sort the characters of the word
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // Check if the sorted word exists in the anagramMap
            if (!anagramMap.containsKey(sortedWord)) {
                // If not, create a new list for this anagram group
                anagramMap.put(sortedWord, new ArrayList<>());
            }

            // Add the word to the corresponding anagram group
            anagramMap.get(sortedWord).add(word);
        }

        // Convert the values of the map to a list of lists
        List<List<String>> anagramBuckets = new ArrayList<>(anagramMap.values());
        return anagramBuckets;
    }

    public static void main(String[] args) {
        String[] words = {"akka", "akak", "baab", "baba", "bbaa"};

        List<List<String>> anagramBuckets = createAnagramBuckets(words);

        // Print the anagram buckets
        System.out.println("Anagram Buckets:");
        for (List<String> bucket : anagramBuckets) {
            System.out.println(bucket);
        }
    }
}
