package com.asaunders2;

/**
 * @author mgreen14
 * @author Aaron Saunders
 * @version 1
 */

public class Dog extends Pet implements Talkable {
    private boolean friendly;

    /**
     *
     * @param friendly boolean showing if the dog is friendly or not
     * @param name gets the dogs name from the super class
     */
    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    /**
     *
     * @return returns whether or not the dog is friendly
     */
    public boolean isFriendly() {
        return friendly;
    }

    /**
     *
     * @return returns a string for the dog's bark
     */
    @Override
    public String talk() {
        return "Bark";
    }

    /**
     *
     * @return returns a string with the dog's name and if its friendly
     */
    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}