package com.sh.leetcode;

import com.sh.sorts.SelectionSort;
import com.sh.sorts.SortTemplate;

/**
 * Created by Mr SJL on 2016/11/18.
 *
 * @author Junlan Shuai
 */
public class Tmain
{
    public static void showRe(int[] a)
    {
        for (int b : a)
        {
            System.out.println(b);
        }
    }
    public static void main(String[] args)
    {
        int a[] = new int[16];
        for (int l = 0; l < 8; l++)
        {
            a[l] = l;
        }
        int b[] = new int[]{};
        merge_sorted_array m = new merge_sorted_array();
        m.merge(a, 8, b, 0);
        showRe(a);
//        single_number sn = new single_number();
//        System.out.println(sn.singleNumber(a));



    }
}
