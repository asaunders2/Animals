package com.asaunders2.test;

import com.asaunders2.Cat;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest{

    Cat testCat;

    @Before
    public void setUp() throws Exception {
        testCat = new Cat(5, "Tom");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getMousesKilled() {
        assertEquals(5, testCat.getMousesKilled());
    }

    @Test
    public void addMouse() {
    }

}