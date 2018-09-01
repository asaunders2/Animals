package com.asaunders2.test;

import com.asaunders2.Dog;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DogTest extends TestCase {

    Dog testDog;

    @Before
    public void setUp() throws Exception {
        testDog = new Dog(true, "Bently");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isFriendly() {
        assertEquals(true, testDog.isFriendly());
    }

    @Test
    public void talk() {
    }

    @Test
    public String toString() {
        return (getName());
    }
}