package com.knoldus.learning.program9;

public class Person {

    /**
     *   The addressId
     */
    private int addressId;
    /**
     *   The city  .
     */
    private String city;
    /**
     *   The Flat  .
     */
    private String flat;
    /**
     *   The State  .
     */
    private String state;

    /**
     * @param addressId
     * @param city
     * @param flat
     * @param state
     */
    public Person(final int addressId,
                  final String city,
                  final String flat,
                  final String state) {
        this.addressId = addressId;
        this.city = city;
        this.flat = flat;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Person{" + "city='" + city + '\'' + '}';
    }

    /**
     * @return city  .
     */
    public String getCity() {
        return city;
    }
}
