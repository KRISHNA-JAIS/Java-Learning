package com.knoldus.learning.program2;

import java.util.Scanner;

public class NthNumberInFibonacci {
    static int fib(int index)
    {
        if (index <= 1)
            return index;
        return fib(index - 1) + fib(index - 2);
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the index to check its value in Fibonacci Series");
        int index = in.nextInt();
        System.out.println(fib(index));
    }
}
