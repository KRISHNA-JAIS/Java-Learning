package com.knoldus.learning.program10;

import java.util.concurrent.*;

class ConcurrentHashMapExample {

    public static void main(final String[] args)
    {
        ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<>();
        m.put(100, "Krishna");
        m.put(101, "Shakti");
        m.put(102, "Govinda");
        m.putIfAbsent(101, "Hello");
        m.remove(101, "Hello");
        m.putIfAbsent(103, "Hello");
        m.replace(101, "Hello", "For");
        System.out.println(m);
    }
}
