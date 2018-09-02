package com.asaunders2.test;

import com.asaunders2.Dog;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogTest{

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

}