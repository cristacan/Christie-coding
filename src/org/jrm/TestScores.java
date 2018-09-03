package org.jrm;

public class TestScores
{
    Integer[] scoreList = new Integer[];

    public TestScores(Integer [] scores) throws IllegalArgumentException
    {
        for (Integer i : scores)
        {
            scoreList = new Integer[]{scoreList, i};
        }
    }

}
