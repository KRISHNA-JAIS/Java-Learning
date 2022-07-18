package com.knoldus.learning.program10;

import java.util.*;
public class HashMapExample {

    /**
     * Hashmap does not maintains any order for it’s objects  .
     * @param args
     */
    public static void main(String args[])
    {
        HashMap<Integer,String> students = new HashMap<>();
        students.put(1, "Jai");
        students.put(2, "Mahesh");
        students.put(3, "Vishal");
        students.put(4, "Hemant");
        students.put(5, "Narender");

        //Print HashMap objects
        for (Map.Entry entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}