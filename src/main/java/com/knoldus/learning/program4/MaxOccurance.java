package com.knoldus.learning.program4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class MaxOccurance {

    /**
     * @param args the args
     */
    public static void main(final String[] args) {
        int[] arr = {9, 1, 4, 4, 8, 2, 2, 6, 2};
        int n = arr.length;
        int k = 3;
        printNmostFrequentNumber(arr, n, k);
    }

    private static void printNmostFrequentNumber(final int[] arr,
                                                 final int n,
                                                 final int k) {

        //Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        Map<Integer, ValueCount> mapValueCount =
                new HashMap<>();
        for (int i = 0; i < n; i++) {
            mapValueCount.put(arr[i], mapValueCount.getOrDefault(arr[i],
                    new ValueCount(arr[i], 0)).incrementCount());
        }
        List<ValueCount> values = new ArrayList<>(mapValueCount.values());
        for (int m = 0; m < k; m++) {
            System.out.println(values.get(m));
        }
    }
}
