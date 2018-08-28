package com.asaunders2;

/**
 * @author mgreen14
 * @author Aaron Saunders
 * @version 1
 */
public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    /**
     *
     * @param mousesKilled tracks number of mice killed
     * @param name gets the name of the cat
     */
    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     *
     * @return returns number of mice killed
     */
    public int getMousesKilled() {
        return mousesKilled;
    }

    /**
     * increments the number of mice killed
     */
    public void addMouse() {
        mousesKilled++;
    }

    /**
     *
     * @return returns a string for the cat's meow
     */
    @Override
    public String talk() {
        return "Meow";
    }

    /**
     *
     * @return returns a string containing the cat's name and number of mice killed
     */
    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}

