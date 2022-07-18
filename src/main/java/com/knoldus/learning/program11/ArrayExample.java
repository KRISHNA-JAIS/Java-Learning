package com.knoldus.learning.program11;

import java.util.Arrays;

public class ArrayExample {
    /**
     * @param args
     */
    public static void main(final String[] args){
        int[] arr = new int[20];
        for(int index = 0; index < 20; index++) {
            arr[index] = index;
        }
        System.out.println("Printing the array values");
        for(int index = 0; index < 20; index++) {
            System.out.println(arr[index]);
        }

    }
}
