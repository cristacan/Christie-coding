package org.jrm;

public class TestScores
{
    Integer[] scoreList = new Integer[0];

    public TestScores(Integer [] scores) throws IllegalArgumentException
    {
        for (Integer i : scores)
        {
            if (i < 0)
            {
                throw new IllegalArgumentException("Test score cannot be less than 0");
            }
            else if (i > 100)
            {
                throw new IllegalArgumentException("Test score cannot exceed 100");
            }

            scoreList = push(scoreList, i);
        }
    }

    private static Integer[] push(Integer[] array, Integer pushed)
    {
        Integer[] returnArray = new Integer[array.length + 1];

        for (int i = 0; i < array.length; i++)
            returnArray[i] = array[i];

        returnArray[array.length] = pushed;

        return returnArray;
    }
}
