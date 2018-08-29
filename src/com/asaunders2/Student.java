package com.asaunders2;

/**
 * @author mgreen14
 * @author Aaron Saunders
 * @version 1
 */
public class Student extends Person implements Talkable {
    private int age;

    /**
     *
     * @param age is an integer showing the age of the person
     * @param name is a string showing the name of the person
     */
    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    /**
     *
     * @return returns an int for the age of the person
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age is an int that is used to set age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return returns a string
     */
    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}
