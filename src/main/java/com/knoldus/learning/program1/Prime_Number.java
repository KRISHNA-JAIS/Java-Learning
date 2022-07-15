package com.knoldus.learning.program1;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int counter, flag=0;
        System.out.println("Enter the number to check it is prime or not");
        int number = in.nextInt();    //it is the number to be checked
        int value = number / 2;
        if(number == 0 || number == 1) {
            System.out.println(number+" is not prime number");
        }else {
            for(counter=2; counter <= value; counter++) {
                if(number % counter == 0) {
                    System.out.println(number + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println(number+" is prime number");
            }
        }
    }
}
