package com.asaunders2.test;


import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import com.asaunders2.Student;


public class StudentTest extends TestCase {

    Student testStudent;

    @Before
    public void setUp() throws Exception {
        testStudent = new Student( 25, "Aaron");
    }

    @Test
    public void testGetAge() {
        testStudent = new Student( 25, "Aaron");
        assertEquals(25, testStudent.getAge());
    }

}