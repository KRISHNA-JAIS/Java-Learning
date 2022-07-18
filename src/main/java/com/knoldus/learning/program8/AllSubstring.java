package com.knoldus.learning.program8;

import java.util.Scanner;

public class AllSubstring {

    /**
     * @param str
     * @param n
     */
    public static void SubString(final String str,
                                 final int n)
    {
        for (int i = 0; i < n-2; i++) {
            System.out.println(str.substring(i, i + 3));
        }
    }

    /**
     * @param args
     */
    public static void main(final String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println("Substring of size three are here");
        SubString(str, str.length());
    }
}
