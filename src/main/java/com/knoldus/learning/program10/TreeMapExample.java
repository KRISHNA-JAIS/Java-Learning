package com.knoldus.learning.program10;

import java.util.*;
public class TreeMapExample {
    /**
     *TreeMap maintains ascending order for it’s elements  .
     * @param args
     */
    public static void main(final String args[])
    {
        TreeMap<Integer,String> students = new TreeMap<>();
        students.put(1, "Jai");
        students.put(4, "Hemant");
        students.put(5, "Narender");
        students.put(2, "Mahesh");
        students.put(3, "Vishal");

        //Print TreeMap objects
        for (Map.Entry entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}