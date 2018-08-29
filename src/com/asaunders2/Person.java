package com.asaunders2;

/**
 * @author mgreen14
 * @author Aaron Saunders
 * @version 1
 */


public abstract class Person {
    private String name;

    /**
     * @param name is a string showing the persons name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     *
     * @return returns the string name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name a string being passed into the method
     */
    public void setName(String name) {
        this.name = name;
    }


}