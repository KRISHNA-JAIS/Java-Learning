package com.knoldus.learning.program9;

import java.util.ArrayList;
import java.util.List;

public class Address {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        List<Person> list = new ArrayList<>();

        list.add(new Person(1, "Gorakhpur", "a1", "UP"));
        list.add(new Person(2, "Lucknow", "b1", "UP"));
        list.add(new Person(3, "Siddharth Nagar", "c1", "UP"));
        list.add(new Person(4, "Maharajganj", "d1", "UP"));
        list.add(new Person(5, "Ghaziabad", "e1", "UP"));
        list.add(new Person(6, "Gonda", "f1", "UP"));
        list.add(new Person(7, "Bareily", "g1", "UP"));
        list.add(new Person(8, "Gonda", "h1", "UP"));
        System.out.println("List of all the distinct Cities :-");

        list.stream()
                .map(Person::getCity)
                .distinct()
                .forEach(System.out::println);
    }

}