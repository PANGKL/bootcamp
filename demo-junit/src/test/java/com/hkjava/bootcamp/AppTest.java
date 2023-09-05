package com.hkjava.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


/**
 * Unit test for simple App.
 */
// @TestInstance(TestInstance.Lifecycle.PER_CLASS) // Default

@TestInstance(TestInstance.Lifecycle.PER_METHOD) // Default
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    private int x;

    @Test
    void testAddMethod() {
        // Assertions.assertEquals(actual value, expected value);
        assertEquals(7, App.add(2, 5));
        assertEquals(8, App.add(3, 5));
        x++;
        assertEquals(1, x);

    }

    @Test
    void testminimum35Number() {
        assertEquals(3333, minimum35.minimum35Number(3355));
        assertEquals(3333, minimum35.minimum35Number(5353));
    }

    @Test
    void testAssertNotEqual() {
        assertNotEquals(10, App.add(3, 5));
    }

    @Test
    void testAssertTrue() {
        assertTrue(12 == App.add(7, 5)); // true
    }

    @Test
    void testAssertFalse() {
        assertFalse(13 == App.add(7, 5)); // true
    }

    @Test
    void assertssNull() {
        String str = null;
        assertNull(str);
    }

    @Test
    void testAssertNoNull() {
        Student student = new Student();
        assertNotNull(student.getSubjects());
    }


    public static void main(String[] args) {
        AppTest t1 = new AppTest();
        t1.testAssertNotEqual();
        t1.testAssertNotEqual();
        System.out.println(t1.x);
        AppTest t2 = new AppTest();
        t2.testminimum35Number();

    }

}
