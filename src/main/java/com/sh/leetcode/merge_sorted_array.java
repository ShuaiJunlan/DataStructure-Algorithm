package com.sh.leetcode;

/**
 * Created by Mr SJL on 2016/11/19.
 *
 * @author Junlan Shuai
 */
public class merge_sorted_array
{
    public void merge(int A[], int m, int B[], int n)
    {
        int[] t = new int[m + n];
        int i = 0, j = 0;
        while (i < m && j < n)
        {
            if (A[i] < B[j])
            {
                t[i + j] = A[i];
                i++;
            } else
            {
                t[i + j] = B[j];
                j++;
            }
        }
        if (i == m)
        {
            for (; j < n; j++)
            {
                t[i + j] = B[j];
            }
        } else if (j == n)
        {
            for (; i < m; i++)
            {
                t[i + j] = A[i];
            }
        }
        //A = t;      //  不能简单地将一个数组赋值给另一个数组
        System.arraycopy(t, 0, A, 0, m + n);

    }
}