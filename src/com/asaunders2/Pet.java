package com.asaunders2;

/**
 * @author mgreen14
 * @author Aaron Saunders
 * @bersion 1
 */
public abstract class Pet {
    protected String name;

    /**
     *
     * @param name is a string showing the name of the pet being passed in
     */
    public Pet(String name) {
        this.name = name;
    }

    /**
     *
     * @return returns the string for the name of the pet
     */
    public String getName() {
        return name;
    }


}