package com.knoldus.learning.program11;

import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        //LinkedList is better to manipulate data
        List<String> list=new LinkedList<>();
        list.add("ankit");
        list.add("pappu");
        list.add("mayank");
        System.out.println("After adding: "+list);
        list.remove("pappu");
        System.out.println("After removing: "+list);
        list.set(1,"vivek");
        System.out.println("After changing: "+list);
    }
}