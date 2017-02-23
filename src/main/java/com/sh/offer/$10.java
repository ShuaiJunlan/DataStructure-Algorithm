package com.sh.offer;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 17:47 2017/2/4.
 */
public class $10
{
    //  当n为负数时，会造成死循环
    public static int _1numberOf1(int n)
    {
        int count  = 0;
        while (n != 0)
        {
            if ((n & 1) != 0)
                count++;
            n = n >> 1;
        }
        return count;
    }
    //
    public static int _2numberOf1(int n)
    {
        int count = 0;
        while (n != 0)
        {
            ++ count;
            n = n & (n-1);
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(_1numberOf1(10));
        System.out.println(_2numberOf1(-10));
    }
}
