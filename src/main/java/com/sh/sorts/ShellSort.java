package com.sh.sorts;

/**
 * Created by Mr SJL on 2016/11/17.
 */
public class ShellSort extends SortTemplate
{
    public void sort(Comparable[] a)
    {
        int N = a.length;
        int h =1;
        while (h < N/3)
            h = 3*h + 1;
        while (h >= 1)
        {
            for (int i = h; i < N; i++)
            {
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h)
                {
                    exchange(a, j, j-h);
                }
            }
            h /= 3;
        }
    }
    public void showResult(Comparable[] a)
    {
        System.out.println("---ShellSort Result");
        super.showResult(a);
        System.out.println("---TheEnd---");
    }
}
