package com.sh.sorts;

/**
 * Created by Mr SJL on 2016/11/17.
 */
public class InsertionSort extends SortTemplate
{
    public void sort(Comparable[] a)
    {
        int N = a.length;
        for (int i = 1; i < N; i++)
        {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
            {
                exchange(a, j, j-1);
            }
        }
    }
    @Override
    public void showResult(Comparable[] a)
    {
        System.out.println("---InsertionSort Result---");
        super.showResult(a);
        System.out.println("---TheEnd---");
    }
}
