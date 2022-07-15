package com.knoldus.learning.program6;

public class PallindromWithMinimumChange {
    /**
     * @param input
     */
    static void minimumChange(String input) {
        int length = input.length();
        int numberOfChanges = 0;
        for(int i = 0; i < length/2; i++) {
            if (input.charAt(i) == input.charAt(length - i - 1))
                continue;
            numberOfChanges += 1;
            if (input.charAt(i) < input.charAt(length - i - 1)) {
                input = input.replace(
                        input.charAt(length - i - 1), input.charAt(i));
            } else {
                input = input.replace(
                        input.charAt(length - 1), input.charAt(length - i - 1));
            }
        }
        System.out.println("Minimum characters to be replaced = " + (numberOfChanges)) ;
        System.out.println(input);
    }

    // Driver code
    public static void main(String args[]) {
        String string = "hello";
        minimumChange(string);
    }
}
