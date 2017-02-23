package com.sh.sorts;

/**
 * Created by Mr SJL on 2016/11/17.
 */

public class MergeSort extends SortTemplate
{
    private Comparable[] aux;                                           //  归并排序所需的辅助数组
    public void sort(Comparable[] a)
    {
        aux = new Comparable[a.length];
        //sortDown(a, 0, a.length - 1);
        sortUp(a);

    }
    /**
     * 原地归并排序
     * @param a     待排序的数组
     * @param lo    数组的最小下标
     * @param mid   数组的中间下标
     * @param hi    数组的最大下标
     */
    private void merge(Comparable[] a, int lo, int mid, int hi)
    {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++)
        {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++)
        {
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (less(aux[j], aux[i]))
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
        }
    }
    /**
     * 自顶向下的归并排序
     * @param a     待排序的数组
     * @param lo    数组的最小下标
     * @param hi    数组的最大小标
     */
    private void sortDown(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo)/2;
        sortDown(a, lo, mid);                                           //  将左半边排序
        sortDown(a, mid+1, hi);                                         //  将右半边排序
        merge(a, lo, mid, hi);                                          //  归并结果
    }

    /**
     * 自底向上的归并排序
     * @param a
     */
    private void sortUp(Comparable[] a)
    {
        int N = a.length;
        for (int sz = 1; sz < N; sz += sz + sz)
        {
            for (int lo = 0; lo < N - sz; lo += sz + sz)
            {
                merge(a, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
            }
        }
    }


    public void showResult(Comparable[] a)
    {
        System.out.println("---MergeSort Result---");
        super.showResult(a);
        System.out.println("---TheEnd---");
    }
}
