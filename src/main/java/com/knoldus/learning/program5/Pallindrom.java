package com.knoldus.learning.program5;

public class Pallindrom {
    /**
     * @param str  .
     * @return the String  .
     */
    public static String isPalindrome(final String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String reverse = stringBuilder.toString();
        if (str.equals(reverse)) {
            String output = str + " is pallindrom";
            return output;
        } else {
            String output = str + " is not pallindrom";
            return output;
        }
    }
}


class TestPalindrome {
    /**
     * @param args
     */
    public static void main(final String[] args) {
        System.out.println(Pallindrom.isPalindrome("nitin"));
        System.out.println(Pallindrom.isPalindrome("delhi"));
    }
}
