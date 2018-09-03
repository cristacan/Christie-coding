package org.jrm;

public class Main
{

    public static void main(String[] args)
    {
        TestScores ts = null;

        try
        {
            ts = new TestScores(new Integer[] {97,43, -105, 78, 82});
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught!");
            System.out.println(e);
        }

        System.out.println(ts);
    }
}
