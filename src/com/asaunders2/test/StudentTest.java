package com.asaunders2.test;


import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import com.asaunders2.Student;


public class StudentTest{

    Student testStudent;

    @Before
    public void setUp() throws Exception {
        testStudent = new Student( 25, "Aaron");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAge() {
        testStudent = new Student( 25, "Aaron");
        assertEquals(25, testStudent.getAge());
    }

    @Test
    public void setAge() {
    }

    @Test
    public void talk() {
    }
}