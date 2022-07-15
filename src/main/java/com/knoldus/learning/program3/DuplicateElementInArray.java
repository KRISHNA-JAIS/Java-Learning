package com.knoldus.learning.program3;

import java.util.Scanner;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total number of element in array");
        int array_size = in.nextInt();
        int [] arr = new int [array_size];
        for(int counter = 0 ; counter <= array_size - 1 ; counter++) {
            arr[counter] = in.nextInt();
        }

        System.out.println("Duplicate elements in given array: ");
        //  Searches for duplicate element
        for(int counter = 0; counter < arr.length; counter++) {
            for(int j = counter + 1; j < arr.length; j++) {
                if(arr[counter] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
