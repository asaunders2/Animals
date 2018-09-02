package com.asaunders2;

import java.util.ArrayList;
import org.junit.*;
/**
 * @author mgreen14
 * @author asaunders2
 * @version 1.1, 9/1/2018
 */

public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");

    /**
     *
     * @param zoo is an instance of the Talkable object
     */
    public static void main(String[] args) {

        ArrayList<Talkable> zoo = new ArrayList<>();

        //calls the add function, and passes in values to be used in the constructor
        zoo.add(new Dog(true, "Pete"));
        zoo.add(new Cat(9, "Anne Belly"));
        zoo.add(new Student(19, "Joe John Johnson"));

        // a loop that runs for each zoo object created
        for (Talkable thing: zoo) {
            printOut(thing);
        }
        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();
        FileInput indata = new FileInput("animals.txt");
        String line;
        //while there is information to be read from the file the loop will run
        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
    }

    /**
     * Returns the information from the Talkable interface
     * @param p the object being passed into the Talkable interface
     */
    public static void printOut(Talkable p)  {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + "|" + p.talk());
    }
}

