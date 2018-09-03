package org.jrm;

public class TestScores
{
    private Integer[] scoreList = new Integer[0];

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

        System.arraycopy(array, 0, returnArray, 0, array.length);

        returnArray[array.length] = pushed;

        return returnArray;
    }

    public int scoreAverage()
    {
        int scoreCount = 0;
        int scoreTotals = 0;
        for (Integer i : scoreList)
        {
            scoreCount += 1;
            scoreTotals += i;
        }

        return scoreTotals / scoreCount;
    }
}
