package org.jrm.test;

import org.jrm.TestScores;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class TestScoresTest {

    private TestScores ts;
    private Throwable exception;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown()
    {
        ts = null;
    }

    // If any test score in the array is negative or greater than 100, the class should throw an IllegalArgumentException.
    @Test
    void verifyConstructorNoLess0()
    {
        assertThrows(IllegalArgumentException.class, ()->{ new TestScores(new Integer[] {-20}); }, "Cannot accept scores less than 0");
    }

    @Test
    void verifyConstructorNoPlus100()
    {
        assertThrows(IllegalArgumentException.class, ()->{ new TestScores(new Integer[] {101}); }, "Cannot accept scores less than 0");
    }
    // Write a class named TestScores. The class constructor should accept an array of test scores as its argument.

    // The class should have a method that returns the average of the test scores.

    // Demonstrate the class in a program.Write an exception class named InvalidTestScores.

    // Modify the TestScores class to throw an InvalidTestScore exception if any of the test scores in the array are invalid.
}