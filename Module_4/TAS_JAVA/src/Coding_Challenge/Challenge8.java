package Coding_Challenge;

import java.util.Arrays;

public class Challenge8 {
    public static void countingSort(int[] arr) {
        // Create a count array to store the count of each element
        int[] count = new int[10]; // We have numbers from 1 to 9

        // Count the occurrences of each element in the input array
        for (int num : arr) {
            count[num]++;
        }

        // Overwrite the input array with sorted elements using counts
        int index = 0;
        for (int i = 1; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        // Example input with 1 million integers ranging from 1 to 9
        int[] arr = generateRandomArray(1000000);

        long startTime = System.currentTimeMillis();

        // Sorting the array
        countingSort(arr);

        long endTime = System.currentTimeMillis();

        // Print the sorted array
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));

        // Print the time taken for sorting
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }

    // Helper function to generate a random array of integers between 1 and 9
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 9) + 1; // Generate random numbers between 1 and 9
        }
        return arr;
    }
}
