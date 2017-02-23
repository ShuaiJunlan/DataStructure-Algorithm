package com.sh.sorts;


/**
 * Created by Mr SJL on 2016/11/17.
 */
public abstract class SortTemplate
{
    public abstract void sort(Comparable[] a);
    public boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w)<0;
    }
    public void exchange(Comparable[] a, int i, int j)
    {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public void showResult(Comparable[] a)
    {
        for(Comparable b : a)
        {
            System.out.println(b);
        }
    }

    public boolean  isSorted(Comparable[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            if (!less(a[i], a[i+1]))
            {
                return false;
            }
        }
        return true;
    }
}
