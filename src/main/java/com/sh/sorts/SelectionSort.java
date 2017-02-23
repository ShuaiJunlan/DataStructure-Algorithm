package com.sh.sorts;

/**
 * Created by Mr SJL on 2016/11/17.
 */
public class SelectionSort extends SortTemplate
{

    /**
     * 此排序算法有问题。尚未解决
     * @param a
     */
    public void sort(Comparable[] a)
    {
        int N = a.length;
        for (int i = 0; i < N; i++)
        {
            int min= i;
            for (int j = i+1; j < N; j++)
            {
                if (less(a[j], a[i]))
                    min = j;
            }
            exchange(a, i, min);
        }
    }

    public void showResult(Comparable[] a)
    {
        System.out.println("---SelectionSort Result---");
        super.showResult(a);
        System.out.println("---TheEnd---");
    }


}
