package com.knoldus.learning.program10;

import java.util.*;
public class LinkedHashMapExample {

    /**
     * LinkedHashmap maintains insertion order for it’s objects.
     * @param args
     */
    public static void main(String args[])
    {
        //Create LinkedHashMap Object
        LinkedHashMap<Integer,String> students = new LinkedHashMap<>();

        //Add objects in LinkedHashMap
        students.put(1, "Jai");
        students.put(4, "Hemant");
        students.put(5, "Narender");
        students.put(2, "Mahesh");
        students.put(3, "Vishal");

        //Print LinkedHashMap objects
        for (Map.Entry entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
