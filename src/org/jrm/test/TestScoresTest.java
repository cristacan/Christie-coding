package org.jrm.test;

import org.jrm.TestScores;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

    // DONE: Write a class named TestScores. The class constructor should accept an array of test scores as its argument.

    // DONE: If any test score in the array is negative or greater than 100, the class should throw an IllegalArgumentException.
    @DisplayName("No score should be less than 0")
    @Test
    void verifyConstructorNoLess0()
    {
        assertThrows(IllegalArgumentException.class, ()->{ new TestScores(new Integer[] {-20}); }, "Cannot accept scores less than 0");
    }

    // DONE: If any test score in the array is negative or greater than 100, the class should throw an IllegalArgumentException.
    @DisplayName("No score should exceed 100")
    @Test
    void verifyConstructorNoPlus100()
    {
        assertThrows(IllegalArgumentException.class, ()->{ new TestScores(new Integer[] {101}); }, "Cannot accept scores less than 0");
    }

    // DONE: The class should have a method that returns the average of the test scores.
    @DisplayName("Return average of all scores")
    @Test
    void verifyAverage()
    {
        ts = new TestScores(new Integer[]{100, 50});
        assertEquals(75, ts.scoreAverage(), "Average of 100 and 50 is 75");

        ts = new TestScores(new Integer[]{100, 0, 0});
        assertEquals(33, ts.scoreAverage(), "Average of 100, 0 and 0 is 33");
    }

    // TODO: Demonstrate the class in a program.Write an exception class named InvalidTestScores.

    // TODO: Modify the TestScores class to throw an InvalidTestScore exception if any of the test scores in the array are invalid.
}