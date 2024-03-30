package Coding_Challenge;

public class Challenge3 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 3, 7, 1, 8, 9, 4};

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // Check the maximum of the products of max1 and max2, and min1 and min2
        int maxProduct = Math.max(max1 * max2, min1 * min2);

        System.out.println("Two numbers with maximum product: " + max1 + " and " + max2);
        System.out.println("Maximum product: " + maxProduct);
    }
}
