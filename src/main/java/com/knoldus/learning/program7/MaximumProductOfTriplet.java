package com.knoldus.learning.program7;

public class MaximumProductOfTriplet {
    /**
     * @param arr
     * @param length
     * @return maximum product of triplet  .
     */
    static int maxProduct(final int[] arr, final int length) {
        if (length < 3) {
            return -1;
        }
        int maximumProduct = 1;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    maximumProduct = Math.max(maximumProduct,
                            arr[i] * arr[j] * arr[k]);
                }
            }
        }

        return maximumProduct;
    }

    /**
      * @param args
     */
    public static void main (final String[] args) {
        int[] arr = {10, 3, 5, 6, 20, 7};
        int length = arr.length;
        int max = maxProduct(arr, length);
        if (max == -1) {
            System.out.println("Enter at least three value in the array");
        } else {
            System.out.println("Maximum product is " + max);
        }
    }
}
