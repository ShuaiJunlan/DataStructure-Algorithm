package com.sh.sorts;

/**
 * Created by Mr SJL on 2016/11/17.
 *
 * @author Junlan Shuai
 */
public class QuickSort extends SortTemplate
{
    public void sort(Comparable[] a)
    {
        sort(a, 0, a.length-1);
    }
    private void sort(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo)
            return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    private int partition(Comparable[] a, int lo, int hi)
    {
        int i = lo, j = hi +1;
        Comparable v = a[lo];
        while (true)
        {
            while (less(a[i++], v))                 //  注意这里的‘++i’,和‘i++’的区别，如果使用后者有可能出现数组越界错误
                if (i == hi)
                    break;
            while (less(v, a[--j]))                 //  注意这里的‘--j’,和‘j--’的区别，如果使用后者有可能出现数组越界错误
                if ( j == lo)
                    break;
            if (i >= j)
                break;
            exchange(a, i, j);
        }
        exchange(a, lo, j);
        return j;
    }
    @Override
    public void showResult(Comparable[] a)
    {
        System.out.println("---QuickSort Result---");
        super.showResult(a);
        System.out.println("---TheEnd---");
    }
}
