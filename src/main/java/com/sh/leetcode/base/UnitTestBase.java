package com.sh.leetcode.base;

import org.junit.After;
import org.junit.Before;

/**
 * Created by Mr SJL on 2016/11/26.
 *
 * @Author Junlan Shuai
 */
public class UnitTestBase
{
    public static long begin = 0;
    public static long stop = 0;

    public UnitTestBase()
    {

    }
    @Before
    public void before()
    {
        begin = System.currentTimeMillis();

    }
    @After
    public void after()
    {
        stop = System.currentTimeMillis();
    }

    public static void getTotalTime()
    {
        System.out.println("Total time:" + (stop-begin));
    }

}
